import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class LogWriter implements IWriter {

	@Override
	public void write(String path, List<Log> logs)
			throws IOException {

		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				path)));

		for (Log logRecord : logs) {
			out.println(logRecord);
		}

		out.close();
	}
}