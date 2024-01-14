package DependencyInjection;

public class Main {

    private ICompiler compiler;

    public Main(ICompiler obj) {
        this.compiler = obj;
    }

    public void compile(String code, String compiler) {
        this.compiler.compile(code, compiler);
    }

    public static void main(String[] args) {

        Main obj1 = new Main(new CCompiler());
        obj1.compile("Hello World", "gcc");

        Main obj2 = new Main(new JavaCompiler());
        obj2.compile("Hello World", "javac");

        Main obj3 = new Main(new CSharpCompiler());
        obj3.compile("Hello World", "C# Compiler");

    }
}
