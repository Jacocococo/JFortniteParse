package me.fungames.jfortniteparse.ue4.versions

import me.fungames.jfortniteparse.ue4.reader.FArchive

object EUnrealEngineObjectUE5Version {
    const val INITIAL_VERSION = 1000
    const val NAMES_REFERENCED_FROM_EXPORT_DATA = 1001
    const val PAYLOAD_TOC = 1002

    const val AUTOMATIC_VERSION = PAYLOAD_TOC
}

/**
 * This object combines all of our version enums into a single easy to use structure
 * which allows us to update older version numbers independently of the newer version numbers.
 */
class FPackageFileVersion(var fileVersionUE4: Int, var fileVersionUE5: Int) {
    constructor(Ar: FArchive) : this(Ar.readInt32(), Ar.readInt32())

    /** Set all versions to the default state */
    inline fun reset() {
        fileVersionUE4 = 0
        fileVersionUE5 = 0
    }

    var value: Int
        inline get() = if (fileVersionUE5 >= EUnrealEngineObjectUE5Version.INITIAL_VERSION) fileVersionUE5 else fileVersionUE4
        inline set(value) {
            if (value >= EUnrealEngineObjectUE5Version.INITIAL_VERSION) {
                fileVersionUE5 = value
            } else {
                fileVersionUE4 = value
            }
        }

    inline operator fun compareTo(other: Int) = value - other

    companion object {
        /** Creates and returns a FPackageFileVersion based on a single EUnrealEngineObjectUEVersion and no other versions. */
        @JvmStatic inline fun createUE4Version(version: Int) = FPackageFileVersion(version, 0)
    }
}