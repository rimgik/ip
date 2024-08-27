public class Todo extends Task{

    Todo(String description) {
        super(description);
    }

    Todo(String description, boolean isDone) {
        super(description, isDone);
    }

    @Override
    public String toFileFormat() {
        String isDoneString = this.isDone ? "1" : "0";
        return getTypeIcon().charAt(1) + "|" + isDoneString + "|" + this.getDescription();
    }

    @Override
    public String toString() {
        return getTypeIcon() + super.toString();
    }

    @Override
    public String getTypeIcon() {
        return "[T]";
    }
}
