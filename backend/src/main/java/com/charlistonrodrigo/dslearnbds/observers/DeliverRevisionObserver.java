package com.charlistonrodrigo.dslearnbds.observers;

import com.charlistonrodrigo.dslearnbds.entities.Deliver;

public interface DeliverRevisionObserver {
	
	void onSaveRevision(Deliver deliver);

}
