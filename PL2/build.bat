@echo off

antlr PSeIntLexer.g4 && antlr PSeIntParser.g4 && javac -encoding utf8 *.java