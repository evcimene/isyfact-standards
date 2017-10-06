package de.bund.bva.isyfact.task;

import de.bund.bva.isyfact.task.model.Task;

import java.util.List;
import java.util.concurrent.ScheduledFuture;

/**
 * Der TaskScheduler bietet die Möglichkeit, dass Aufgaben (Tasks) zu bestimmten Zeitpunkten ausgeführt werden können.
 *
 * @author Alexander Salvanos, msg systems ag
 *
 */
public interface TaskScheduler {
	/**
	 *
	 */
	void addTask(Task task);

	/**
	 *
	 */
	void start() throws NoSuchMethodException;

	/**
	 *
	 */
	void stop();

	/**
	 *
	 * @param seconds
	 * @throws InterruptedException
	 */
	void awaitTerminationInSeconds(long seconds) throws InterruptedException;

	/**
	 *
	 */
    void shutDown();

	/**
	 *
	 */
	List<Runnable> shutDownNow();

	/**
	 *
	 */
	boolean isTerminated();
}
