SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"

python do_display_banner() {
    bb.plain("***********************************************");
    bb.plain("*                                             *");
    bb.plain("*  Example recipe created by bitbake-layers   *");
    bb.plain("*                                             *");
    bb.plain("***********************************************");
}

addtask display_banner before do_build

do_deploy:append() {
    echo "dtparam=spi=on" >> $CONFIG
    echo "dtoverlay=spi1-1cs,cs0_pin=18" >> $CONFIG
    echo "dtoverlay=uart3" >> $CONFIG
    echo "dtoverlay=uart1" >> $CONFIG
    echo "dtoverlay=uart2" >> $CONFIG
    echo "dtoverlay=uart4" >> $CONFIG
    echo "gpu_mem=8" >> $CONFIG
    echo "arm_freq=600" >> $CONFIG
    echo "arm_freq_min=600" >> $CONFIG
}