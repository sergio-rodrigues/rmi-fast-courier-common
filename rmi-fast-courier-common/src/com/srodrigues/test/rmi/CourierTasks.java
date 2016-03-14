package com.srodrigues.test.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface CourierTasks extends Remote {
	boolean add(final String task) throws RemoteException;
	boolean delete(final String task) throws RemoteException;

	List<String> get() throws RemoteException;
}
