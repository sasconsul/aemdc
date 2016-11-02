package com.headwire.aemc.menu;

import java.io.IOException;

import com.headwire.aemc.command.CommandMenu;
import com.headwire.aemc.command.CreateFileCommand;
import com.headwire.aemc.command.ReplacePlaceHoldersCommand;
import com.headwire.aemc.companion.Resource;


/**
 * OSGI creator
 *
 */
public class OsgiRunner implements BasisRunner {

  // Invoker
  private final CommandMenu menu = new CommandMenu();

  /**
   * Constructor
   *
   * @param params
   *          - params
   */
  public OsgiRunner(final Resource resource) {
    // Creates Invoker object, command object and configure them
    menu.setCommand("CreateFile", new CreateFileCommand(resource));
    menu.setCommand("ReplacePlaceHolders", new ReplacePlaceHoldersCommand(resource));
  }

  /**
   * Run commands
   *
   * @throws IOException
   */
  @Override
  public void run() throws IOException {
    // Invoker invokes command
    menu.runCommand("CreateFile");
    menu.runCommand("ReplacePlaceHolders");
  }

}