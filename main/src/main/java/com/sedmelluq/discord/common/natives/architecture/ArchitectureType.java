package com.sedmelluq.discord.common.natives.architecture;

public interface ArchitectureType {
  /**
   * @return Identifier used in directory names (combined with OS identifier) for this ABI
   */
  String identifier();
}
