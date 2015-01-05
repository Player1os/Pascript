package pascript;

import pascript.grammar.PascriptLexer;
import pascript.grammar.PascriptParser;
import java.io.IOException;
import java.io.InputStream;
import java.text.Normalizer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author Osama Hasanein
 */
public class Compiler
{

    private static class PascriptInputStream extends ANTLRInputStream
    {
        public PascriptInputStream(InputStream inputStream) throws IOException
        {
            super(inputStream);
        }
        
        @NotNull
        @Override
        public String getText(@NotNull Interval interval)
        {
            return Normalizer
                .normalize(super.getText(interval), Normalizer.Form.NFD)
                .replaceAll("[^\\x00-\\x7F]", "")
                .toLowerCase();
        }
    }
    
    /**
     * @param args the command line arguments
     * @return 
     */
    public static int main(String[] args)
    {
        try
        {
            PascriptInputStream input = new PascriptInputStream(System.in);
            PascriptLexer lexer = new PascriptLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PascriptParser parser = new PascriptParser(tokens);
            ParseTree tree = parser.module();

            CodeVisitor codeVisitor = new CodeVisitor();
            CodeFragment code = codeVisitor.visit(tree);
            System.out.println(code.toString());
        }
        catch (IOException ex)
        {
            System.err.println("Error while reading from input :");
            System.err.println(ex.getMessage());
            return -1;
        }
        return 0;
    }
}
