import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class FileGenerator {

	public static String generatepath(String fileName)  throws IOException{
		String filepath=System.getProperty("user.dir")+"\\src\\main\\java\\resoources\\"+fileName;
	return new String(Files.readAllBytes(Paths.get(filepath)));
	}
	/*public void main (String args[]) throws IOException {
		String fileName = null;
		System.out.println(generatepath(fileName));
	}*/
}
