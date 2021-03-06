package me.exerosis.jager.engine.test.example;

import me.exerosis.jager.engine.core.state.State;
import me.exerosis.jager.engine.implementation.components.player.gadget.Gadget;

public class HubState extends State {
	private Gadget[] gadgets = new Gadget[] {};

	public HubState(Gadget... gadgets) {
		this.gadgets = gadgets;
	}

	@Override
	protected void onEnable() {
		for (Gadget gadget : gadgets) {
			gadget.enable();
		}
	}

	@Override
	protected void onDisable() {
		for (Gadget gadget : gadgets) {
			gadget.disable();
		}
	}

}
