require ${PN}.inc
PV = "${OPIE_GIT_PV}"
PR = "r1"

RDEPENDS_${PN} += "opie-bluetoothd"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=noncore/net/opietooth/manager \
           ${OPIE_GIT};protocol=git;subpath=apps \
           ${OPIE_GIT};protocol=git;subpath=pics"
