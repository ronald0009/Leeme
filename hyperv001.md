# Install Hyper-V on Windows 10
## Check Requirements
1. Run command
```
msinfo32
```
2. Select 'System Summary'
3. Look for the four items that begin with Hyper-V. If you see a Yes next to each one, you're ready to enable Hyper-V.
4. Windows 10: Enterprise, Pro, Education
5. >= 4GB RAM
## Enable Hyper-V using PowerShell
1. Open a PowerShell console as Administrator
2. Run command:
```
Enable-WindowsOptionalFeature -Online -FeatureName Microsoft-Hyper-V -All
```
3. When the installation has completed, reboot
