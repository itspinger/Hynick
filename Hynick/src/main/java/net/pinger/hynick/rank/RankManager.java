package net.pinger.hynick.rank;

import org.bukkit.entity.Player;

import java.util.List;

public interface RankManager {

    /**
     * This method returns all available ranks to the specified player.
     *
     * @param player the specified player
     * @return all available ranks
     */

    List<Rank> getAvailableRanks(Player player);

}
