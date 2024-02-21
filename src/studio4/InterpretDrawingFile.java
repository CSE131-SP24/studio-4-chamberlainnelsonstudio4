package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean filled = in.nextBoolean();
		double one = in.nextDouble();
		double two = in.nextDouble();
		double three = in.nextDouble();
		double four = in.nextDouble();
		Color oewr = new Color(red, green, blue);
		StdDraw.setPenColor(oewr);
		if (shape.equals("ellipse")) {
			if (filled) {
				StdDraw.filledEllipse(one, two, three, four);
				
			}
			else { 
				StdDraw.ellipse(one, two, three, four);
			}
		}
		else if (shape.equals( "rectangle")) {
			if (filled) {
				StdDraw.filledRectangle(one, two, three, four);
				
			}
			else { 
				StdDraw.rectangle(one, two, three, four);
			}
		}
		/*else {
			double five = in.nextDouble();
			double six = in.nextDouble();
			if (filled) {
				StdDraw.line(one, two, three, four);
				StdDraw.line(one, two, five, six);
				StdDraw.line(five, six, three, four);
				
			}
			else { 
				StdDraw.line(one, two, three, four);
				StdDraw.line(one, two, five, six);
				StdDraw.line(five, six, three, four);
			}

		}
		*/
	}
}
