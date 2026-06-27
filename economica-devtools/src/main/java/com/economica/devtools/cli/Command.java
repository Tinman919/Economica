package com.economica.devtools.cli;

public interface Command {

    String name();

    void execute(String[] args);

}
