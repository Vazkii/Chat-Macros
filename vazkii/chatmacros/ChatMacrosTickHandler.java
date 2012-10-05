package vazkii.chatmacros;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import net.minecraft.src.GuiChat;
import net.minecraft.src.GuiScreen;
import vazkii.codebase.common.CommonUtils;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class ChatMacrosTickHandler implements ITickHandler {

	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {
		if (type.equals(EnumSet.of(TickType.CLIENT))) {
			Minecraft mc = CommonUtils.getMc();
			GuiScreen screen = mc.currentScreen;
			if (screen instanceof GuiChat && !(screen instanceof GuiChatMacros)) mc.displayGuiScreen(new GuiChatMacros());
		}

	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {
	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.CLIENT);
	}

	@Override
	public String getLabel() {
		return "Chat Macros";
	}

}
