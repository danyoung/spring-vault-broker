package com.engineerbetter.vaultbroker;

import java.util.UUID;

public interface InstanceManager {
	UUID create(String name);
	
	void delete(UUID instanceId);
}
