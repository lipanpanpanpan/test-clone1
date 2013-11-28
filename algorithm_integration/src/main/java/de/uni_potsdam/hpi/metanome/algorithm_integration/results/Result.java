package de.uni_potsdam.hpi.metanome.algorithm_integration.results;

import de.uni_potsdam.hpi.metanome.algorithm_integration.result_receiver.OmniscientResultReceiver;

/**
 * @author Jakob Zwiener
 * 
 * All Results need to be sendable to an {@link OmniscientResultReceiver}.
 */
public interface Result {

	/**
	 * Sends a result to an {@link OmniscientResultReceiver}.
	 * 
	 * @param resultReceiver
	 */
	public void sendResultTo(OmniscientResultReceiver resultReceiver);
	
}