package DependencyInjection;

public class CCompiler extends IDE implements ICompiler {

    public void compile(String code, String compiler) {
        System.out.println("This code compiled : " + getCodeLine(code) + " by using " + compiler);
    }

    public String getCodeLine(String code) {
        codeLine = "printf('" + code + "')";
        return codeLine;
    }
}
