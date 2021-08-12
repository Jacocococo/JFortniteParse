package me.fungames.jfortniteparse.ue4.versions

internal const val VER_UE4_DETERMINE_BY_GAME = -1

// Pre-release UE4 file versions
internal const val VER_UE4_ASSET_REGISTRY_TAGS = 112
internal const val VER_UE4_TEXTURE_DERIVED_DATA2 = 124
internal const val VER_UE4_ADD_COOKED_TO_TEXTURE2D = 125
internal const val VER_UE4_REMOVED_STRIP_DATA = 130
internal const val VER_UE4_REMOVE_EXTRA_SKELMESH_VERTEX_INFLUENCES = 134
internal const val VER_UE4_TEXTURE_SOURCE_ART_REFACTOR = 143
internal const val VER_UE4_ADD_SKELMESH_MESHTOIMPORTVERTEXMAP = 152
internal const val VER_UE4_REMOVE_ARCHETYPE_INDEX_FROM_LINKER_TABLES = 163
internal const val VER_UE4_REMOVE_NET_INDEX = 196
internal const val VER_UE4_BULKDATA_AT_LARGE_OFFSETS = 198
internal const val VER_UE4_SUMMARY_HAS_BULKDATA_OFFSET = 212
internal const val VER_UE4_STATIC_MESH_STORE_NAV_COLLISION = 216
internal const val VER_UE4_DEPRECATED_STATIC_MESH_THUMBNAIL_PROPERTIES_REMOVED = 242
internal const val VER_UE4_APEX_CLOTH = 254
internal const val VER_UE4_STATIC_SKELETAL_MESH_SERIALIZATION_FIX = 269
internal const val VER_UE4_SUPPORT_32BIT_STATIC_MESH_INDICES = 277
internal const val VER_UE4_APEX_CLOTH_LOD = 280
internal const val VER_UE4_ARRAY_PROPERTY_INNER_TAGS = 282 // note: here's a typo in UE4 code - "VAR_" instead of "internal const val VER_"
internal const val VER_UE4_KEEP_SKEL_MESH_INDEX_DATA = 283
internal const val VER_UE4_MOVE_SKELETALMESH_SHADOWCASTING = 302
internal const val VER_UE4_REFERENCE_SKELETON_REFACTOR = 310
internal const val VER_UE4_FIXUP_ROOTBONE_PARENT = 312
internal const val VER_UE4_FIX_ANIMATIONBASEPOSE_SERIALIZATION = 331
internal const val VER_UE4_SUPPORT_8_BONE_INFLUENCES_SKELETAL_MESHES = 332
internal const val VER_UE4_SUPPORT_GPUSKINNING_8_BONE_INFLUENCES = 334
internal const val VER_UE4_ANIM_SUPPORT_NONUNIFORM_SCALE_ANIMATION = 335
internal const val VER_UE4_ENGINE_VERSION_OBJECT = 336
internal const val VER_UE4_SKELETON_GUID_SERIALIZATION = 338
// UE4.0 source code was released on GitHub. Note: if we don't have any internal const val VER_UE4_...
// values between two internal const val VER_UE4_xx constants for instance between internal const val VER_UE4_0 and internal const val VER_UE4_1
// it doesn't matter for this framework which version will be serialized serialized -
// 4.0 or 4.1 because 4.1 has nothing new for supported object formats compared to 4.0.
internal const val VER_UE4_0 = 342
internal const val VER_UE4_MORPHTARGET_CPU_TANGENTZDELTA_FORMATCHANGE = 348
internal const val VER_UE4_1 = 352
internal const val VER_UE4_2 = 363
internal const val VER_UE4_LOAD_FOR_EDITOR_GAME = 365
internal const val VER_UE4_FTEXT_HISTORY = 368					// used for UStaticMesh versioning
internal const val VER_UE4_STORE_BONE_EXPORT_NAMES = 370
internal const val VER_UE4_3 = 382
internal const val VER_UE4_ADD_STRING_ASSET_REFERENCES_MAP = 384
internal const val VER_UE4_4 = 385
internal const val VER_UE4_SKELETON_ADD_SMARTNAMES = 388
internal const val VER_UE4_SOUND_COMPRESSION_TYPE_ADDED = 392
internal const val VER_UE4_RENAME_CROUCHMOVESCHARACTERDOWN = 394	// used for UStaticMesh versioning
internal const val VER_UE4_DEPRECATE_UMG_STYLE_ASSETS = 397		// used for UStaticMesh versioning
internal const val VER_UE4_5 = 401
internal const val VER_UE4_6 = 413
internal const val VER_UE4_RENAME_WIDGET_VISIBILITY = 416			// used for UStaticMesh versioning
internal const val VER_UE4_ANIMATION_ADD_TRACKCURVES = 417
internal const val VER_UE4_7 = 434
internal const val VER_UE4_STRUCT_GUID_IN_PROPERTY_TAG = 441
internal const val VER_UE4_PACKAGE_SUMMARY_HAS_COMPATIBLE_ENGINE_VERSION = 444
internal const val VER_UE4_8 = 451
internal const val VER_UE4_SERIALIZE_TEXT_IN_PACKAGES = 459
internal const val VER_UE4_NEW_LIGHTMASS_PRIMITIVE_SETTING = 461
internal const val VER_UE4_9 = 482
internal const val VER_UE4_10 = VER_UE4_9								// exactly the same file version for 4.9 and 4.10
internal const val VER_UE4_COOKED_ASSETS_IN_EDITOR_SUPPORT = 485
internal const val VER_UE4_SOUND_CONCURRENCY_PACKAGE = 489		// used for UStaticMesh versioning
internal const val VER_UE4_11 = 498
internal const val VER_UE4_INNER_ARRAY_TAG_INFO = 500
internal const val VER_UE4_PROPERTY_GUID_IN_PROPERTY_TAG = 503
internal const val VER_UE4_NAME_HASHES_SERIALIZED = 504
internal const val VER_UE4_12 = 504
internal const val VER_UE4_13 = 505
internal const val VER_UE4_PRELOAD_DEPENDENCIES_IN_COOKED_EXPORTS = 507
internal const val VER_UE4_TemplateIndex_IN_COOKED_EXPORTS = 508
internal const val VER_UE4_14 = 508
internal const val VER_UE4_PROPERTY_TAG_SET_MAP_SUPPORT = 509
internal const val VER_UE4_ADDED_SEARCHABLE_NAMES = 510
internal const val VER_UE4_15 = 510
internal const val VER_UE4_64BIT_EXPORTMAP_SERIALSIZES = 511
internal const val VER_UE4_16 = 513
internal const val VER_UE4_17 = 513
internal const val VER_UE4_ADDED_SOFT_OBJECT_PATH = 514
internal const val VER_UE4_18 = 514
internal const val VER_UE4_ADDED_PACKAGE_SUMMARY_LOCALIZATION_ID = 516
internal const val VER_UE4_19 = 516
internal const val VER_UE4_20 = 516
internal const val VER_UE4_21 = 517
internal const val VER_UE4_22 = 517
internal const val VER_UE4_23 = 517
internal const val VER_UE4_ADDED_PACKAGE_OWNER = 518
internal const val VER_UE4_24 = 518
internal const val VER_UE4_25 = 518
internal const val VER_UE4_SKINWEIGHT_PROFILE_DATA_LAYOUT_CHANGES = 519
internal const val VER_UE4_NON_OUTER_PACKAGE_IMPORT = 520
internal const val VER_UE4_ASSETREGISTRY_DEPENDENCYFLAGS = 521
internal const val VER_UE4_26 = 522
internal const val VER_UE4_CORRECT_LICENSEE_FLAG = 522
internal const val VER_UE4_27 = 523 // actually 522 but we bumped it by one for comparison when reading MinMobileLODIdx in UStaticMesh & USkeletalMesh
internal const val VER_UE5_0 = 523 // TODO check this again when UE5 is released
// look for NEW_ENGINE_VERSION over the code to find places where version constants should be inserted.
// LATEST_SUPPORTED_UE4_VERSION should be updated too.