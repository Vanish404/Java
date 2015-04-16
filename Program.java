import java.io.IOException;

class Program 
{

	public static void main(String[] args) throws IOException {

		LogInput data = new LogInput(args);
		ILogParser logParser = new LogParser();
		IWriter writer = new LogWriter();
		IReader reader = new LogReader();
}