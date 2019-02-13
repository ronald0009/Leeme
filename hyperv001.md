# Hyper-V on Windows 10
## Requirements
1. Run command
```
msinfo32
```
2. Select 'System Summary'
3. Look for the four items that begin with Hyper-V, a Yes next to each one is OK
4. SO Windows 10 Pro edition
5. 16GB RAM
## Enable Hyper-V using PowerShell
1. Open a PowerShell console as Administrator
2. Run command:
```
Enable-WindowsOptionalFeature -Online -FeatureName Microsoft-Hyper-V -All
```
3. Reboot
