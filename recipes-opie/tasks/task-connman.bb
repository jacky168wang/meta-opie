DESCRIPTION = "Tasks for Opie ConnMan settings"
LICENSE = "MIT"

PR = "r0"

inherit task

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

RDEPENDS_${PN} = "opie-connmansettings opie-connmanapplet \
                  connman-plugin-ethernet \
                  ${@base_contains('DISTRO_FEATURES', 'wifi', 'connman-plugin-wifi', '',d)} \
                  ${@base_contains('DISTRO_FEATURES', 'bluetooth', 'connman-plugin-bluetooth', '',d)} \
                  "

