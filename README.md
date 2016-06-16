# Overview
This example shows how to use the arabic fonts.

## HowToUseArabicFont

1. First of all, you must have a font containing the characters of the unicode block called `Arabic Presentation Forms-B` i.e. the range `0xFE70-0xFEFF`.
2. Then your strings must be formed with the characters of this range too (as you
can see with the strings of HowToUseArabicFontDisplayable.TITLE and HowToUseArabicFontDisplayable.AVAILABLE_TEXTS, /u0020 corresponds to the space character).
3. Finally the order of the strings must be reversed.

### Requirements
- JRE 7 (or later) x86.
- MicroEJ 3.1 or later.
- Java platform with (at least) EDC-1.2, MICROUI-1.5.0.

### Project structure
- `src/main/java`
  - Java sources
- `src/main/resources`
  - Font
- `launches/`: MicroEJ launches

### Launches
A Simulation and an Embedded launch configuration are available.

## Changes
- HowToUseArabicFont example.

## License
See the license file `LICENSE.md` located at the root of this repository.