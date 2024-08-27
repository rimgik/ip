package com.Commands;
import com.Nimbus.*;

import java.util.ArrayList;

abstract public class Command {
    /**
     * Execute the command
     * @param ui      The Ui used to display the result of the execution
     * @param storage The storage to save the change after executing the command
     * @param tasks   The tasks to be modified (if needed)
     * @throws InvalidArgumentException if the argument of a Command does not match it's Command Type.
     */
    public abstract void execute(Ui ui, Storage storage, TaskList tasks)
            throws InvalidArgumentException;
}
