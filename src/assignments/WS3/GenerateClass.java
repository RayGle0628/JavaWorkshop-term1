package assignments.WS3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
/**
 *This class mainly declares three variables and creates a constructor.
 *  In addition, you also wrote makeFields (), makeConstructor (),
 *  makeGetters (), makeSetters () and so on.
 *  Used to return a statement of type String.
 * Finally wrote a writeFile() to output a complete class via I/O.
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/10/29
 * @Content:workshop
 */
public class GenerateClass {

	private String classname;
	private String[] variableNames;
	private String[] variableTypes;

	/**
	 * @param classname   The name of a class
	 * @param variableNames An array to represent the names of the Variables
	 * @param variableTypes  An array to represent the types of the Variable
	 */
	public GenerateClass(String classname, String[] variableNames, String[] variableTypes) {
		this.classname = classname;
		this.variableNames = variableNames;
		this.variableTypes = variableTypes;
	}

	/**
	 * @return
	 *   a String with a declaration of
	 *  the corresponding field variables
	 */

	public String makeFields() {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < variableNames.length; ++i) {
			stringBuilder.append("  private " + variableTypes[i] + " " + variableNames[i] + ";\n");
		}
		stringBuilder.append("\n");

		return stringBuilder.toString();
	}

	/**
	 * @return a String with a corresponding constructor.
	 */
	public String makeConstructor() {
		StringBuilder stringBuilder = new StringBuilder("  ");
		stringBuilder.append("public ").append(classname).append("(");

		if (variableNames.length != 0) {
			for (int i = 0; i < variableNames.length; ++i) {
				stringBuilder.append(variableTypes[i] + " " + variableNames[i]);
				if (i != variableNames.length - 1) {
					stringBuilder.append(", ");
				}
			}
			stringBuilder.append("){\n");
			for (int i = 0; i < variableNames.length; ++i) {
				stringBuilder.append("    this." + variableNames[i] + " = " + variableNames[i] + ";\n");
			}
			stringBuilder.append("  }\n");
		} else {
			stringBuilder.append("){}\n");
		}

		return stringBuilder.toString();
	}

	/**
	 * @return returns a String with all setters in the order
	 * given by variableNames/variableTypes.
	 */
	public String makeGetters() {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < variableNames.length; ++i) {
			stringBuilder.append("  public " + variableTypes[i] + " get"
					+ variableNames[i].substring(0, 1).toUpperCase() + variableNames[i].substring(1) + "(){\n");
			stringBuilder.append("    return " + variableNames[i] + ";\n  }\n");
		}

		return stringBuilder.toString();
	}

	/**
	 * @return  a String with all setters in the order given by
	 * 	 variableNames/variableTypes
	 */

	public String makeSetters() {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < variableNames.length; ++i) {
			stringBuilder.append("  public void set" + variableNames[i].substring(0, 1).toUpperCase()
					+ variableNames[i].substring(1) + "(" + variableTypes[i] + " " + variableNames[i] + "){\n");
			stringBuilder.append("    this." + variableNames[i] + " = " + variableNames[i] + ";\n  }\n");
		}

		return stringBuilder.toString();
	}

	/**
	 *  the method public void writeFile() that writes a rudimentary class,
	 *  starting with the classname and the opening {, the field variables,
	 *  the constructor, the getters, the setters, and the closing }
	 * to a file with the name given by the classname extended by .java.
	 * If the file cannot be written, the
	 * corresponding IOException is to be caught and an error message to be printed to the user. Indent always
	 * by two empty spaces.
	 */
	public void writeFile() {
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("public class " + classname + "{\n\n");
		stringBuilder.append(makeFields());
		stringBuilder.append(makeConstructor() + "\n");
		stringBuilder.append(makeGetters() + "\n");
		stringBuilder.append(makeSetters() + "\n");
		stringBuilder.append("}\n");

		String str = stringBuilder.toString();

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(classname + ".java")));
			bw.write(str);
			bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String classname1 = "Person1";
		String[] variableNames1 = { "name", "dob" };
		String[] variableTypes1 = { "String", "Date" };
	GenerateClass	personOneClass = new GenerateClass(classname1, variableNames1,
			variableTypes1);
	personOneClass.makeFields();
	personOneClass.writeFile();
	}

}
