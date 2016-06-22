# Overview
This example shows how to use the arabic fonts.

# Usage

1. First of all, you must have a font containing the characters of the unicode block called `Arabic Presentation Forms-B` i.e. the range `0xFE70-0xFEFF`.

2. Then your strings must be formed with the characters of this range too (as you can see with the strings of HowToUseArabicFontDisplayable.TITLE and HowToUseArabicFontDisplayable.AVAILABLE_TEXTS, /u0020 corresponds to the space character).
3. Finally the order of the strings must be reversed.

## Run on MicroEJ Simulator
1. Right Click on the project
1. Select **Run as -> MicroEJ Application**
1. Select your platform 
1. Press **Ok**

## Run on device
### Build
1. Right Click on [HowToUseArabicFont.java](HowToUseArabicFont/src/main/java/ej/examples/arabicfont/HowToUseArabicFont.java)
1. Select **Run as -> Run Configuration**
1. Select **MicroEJ Application** configuration kind
1. Click on **New launch configuration** icon
1. Select **Execute on Device**
1. Select **Build & Deploy**
1. Go to **Execution** tab
	* Select your platform 
1. Press **Apply**
1. Press **Run**
1. Copy the generated `.out` file path

### Flash
1. Use the appropriate flashing tool.

# Requirements
* MicroEJ Studio or SDK 4.0 or later
* A platform with at least:
	* EDC-1.2 or higher
	* MICROUI-2.0 or higher
	
# Changes
See the changelog file [CHANGELOG.md](CHANGELOG.md) located at the root of this repository.

# License
See the license file [LICENSE.md](LICENSE.md) located at the root of this repository.
