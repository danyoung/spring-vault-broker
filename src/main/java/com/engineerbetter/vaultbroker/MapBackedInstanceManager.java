package com.engineerbetter.vaultbroker;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class MapBackedInstanceManager implements InstanceManager {
	private Map<UUID, String> instanceNames;
	
	public MapBackedInstanceManager() {
		instanceNames = new HashMap<>();
	}
	
	@Override
	public UUID create(String name) {
		UUID instanceId = UUID.randomUUID();
		instanceNames.put(instanceId, name);
		return instanceId;
	}

	@Override
	public void delete(UUID instanceId) {
		instanceNames.remove(instanceId);
	}

}
