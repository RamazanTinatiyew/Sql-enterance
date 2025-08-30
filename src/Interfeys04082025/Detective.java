package Interfeys04082025;

public sealed interface Detective permits Blood, FingerPrint, FootPrint, Hair {
    void analyze();
}
