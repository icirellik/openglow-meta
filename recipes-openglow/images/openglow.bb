DESCRIPTION = "OpenGlow Platform"

LICENSE = "GPLv3"

inherit core-image

IMAGE_INSTALL = " \
	packagegroup-base \
	packagegroup-core-boot \
	${CORE_IMAGE_EXTRA_INSTALL} \
	i2c-tools \
	u-boot-fw-utils \
	nano \
	openglow-os-tweaks \
	openssh \
	openssh-sftp \
	openssh-sftp-server \
	python \
	python3 \
	python3-smbus \
	python3-spidev \
	stress-ng \
	wpa-supplicant \
"

IMAGE_FEATURES += " ssh-server-openssh "
