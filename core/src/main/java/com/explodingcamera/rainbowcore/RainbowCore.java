package com.explodingcamera.rainbowcore;

import net.fabricmc.api.ModInitializer;
import org.graalvm.polyglot.*;
import org.graalvm.polyglot.proxy.*;

// https://github.com/grakkit/grakkit

public class RainbowCore implements ModInitializer {
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Yeet!");
	}
}
