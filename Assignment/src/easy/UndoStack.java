package easy;

import java.util.Stack;

public class UndoStack {
	public static void main(String[] args) {
		Stack<String> commandStack = new Stack<>();
		commandStack.push("Open File");
		commandStack.push("Edit File");
		commandStack.push("Save File");
		System.out.println("Initial Stack :" + commandStack);
		String undoneCommand = commandStack.pop();
		System.out.println("After Undo (pop): " + commandStack);

		commandStack.push(undoneCommand);
		System.out.println("After redo (push back): " + commandStack);
	}
}
