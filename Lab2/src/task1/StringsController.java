package task1;

public class StringsController {
	private StringsModel model;
	private StringsInput input;

	public StringsController() {
		input = StringsInput.getInstance();
		input.setWrongInputMessage("Wrong input. Try again");
		input.printMessage("Enter total number of strings:");
		int n = input.getPositiveInteger();
		model = new StringsModel(n);
		input.printMessage("Enter strings:");
		for (int i = 0; i < n; i++) {
			input.printMessage((i + 1) + ">");
			model.addString(i, input.getUserInput());
		}
		String maxLengthString = model.getMaxLengthString();
		input.printMessage("String with max length: '" + maxLengthString
				+ "' with length = " + maxLengthString.length());
		input.printMessage(model.toString());
		input.printMessage("refl1: " + (model.equals(model)));
		input.printMessage("refl2: "
				+ (new StringsModel(new String[] { "q" })
						.equals(new StringsModel(new String[] { "q" }))));
		input.printMessage("refl3: "
				+ (new StringsModel(new String[] { "q" }) == new StringsModel(
						new String[] { "q" })));
		input.printMessage("refl4: "
				+ (new StringsModel(new String[] { "q" })
						.equals(new StringsModel(new String[] { "x" }))));
	}
}
