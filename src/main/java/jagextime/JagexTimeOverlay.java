package jagextime;

import net.runelite.client.ui.overlay.Overlay;

import java.awt.*;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class JagexTimeOverlay extends Overlay {
    @Override
    public Dimension render(Graphics2D graphics) {
        graphics.drawString(getJagexTime(), 10, 10);
        return new Dimension(200, 20);
    }

    private String getJagexTime() {
        return LocalTime.now(ZoneId.of("Europe/London")).format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}
