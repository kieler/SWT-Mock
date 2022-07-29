# SWT Mock

This repository contains platform-independent mock code of the SWT API.
This allows Maven projects requiring API but not calling any SWT functionality of the org.eclipse.swt library directly to correctly compile and run without the overhead of the SWT code and requiring different platform-dependent artifacts for various OSs.

This mock is mainly built for [KLighD](https://www.github.com/kieler/KLighD/) as it was initially built only for Eclipse with SWT deeply ingrained into all of its core parts and API, which shifted towards a more open framework working as standalone applications for web-based tools such as VS Code. Therefore it misses much of the SWT API and only includes what is used by KLighD, but can be extended to mock further SWT API.