require ${PN}.inc

PV = "${OPIE_GIT_PV}"
PR = "r1"

SRC_URI = "${OPIE_GIT};protocol=git;subpath=core/applets/multikeyapplet \
           ${OPIE_GIT};protocol=git;subpath=apps"