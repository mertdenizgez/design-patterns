package DependencyInjection;

public class JavaCompiler extends IDE implements ICompiler {

    public void compile(String code, String compiler) {
        System.out.println("This code : " + getCodeLine(code) + " compiled by " + compiler);
    }

    public String getCodeLine(String code) {
        codeLine = "System.out.println('" + code + "')";
        return codeLine;
    }

}
