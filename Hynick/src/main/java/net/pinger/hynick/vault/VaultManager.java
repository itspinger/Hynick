package net.pinger.hynick.vault;

import net.pinger.hynick.rank.Rank;
import org.bukkit.entity.Player;

public interface VaultManager {

    void setPrefix(Player player, Rank rank);

    void resetPrefix(Player player);

}
