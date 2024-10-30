package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
*/
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AndroidxLibraryAccessors laccForAndroidxLibraryAccessors = new AndroidxLibraryAccessors(owner);
    private final ComLibraryAccessors laccForComLibraryAccessors = new ComLibraryAccessors(owner);
    private final DevLibraryAccessors laccForDevLibraryAccessors = new DevLibraryAccessors(owner);
    private final IoLibraryAccessors laccForIoLibraryAccessors = new IoLibraryAccessors(owner);
    private final JavaxLibraryAccessors laccForJavaxLibraryAccessors = new JavaxLibraryAccessors(owner);
    private final OrgLibraryAccessors laccForOrgLibraryAccessors = new OrgLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(providers, config);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers) {
        super(config, providers);
    }

        /**
         * Creates a dependency provider for junit (junit:junit)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJunit() { return create("junit"); }

    /**
     * Returns the group of libraries at androidx
     */
    public AndroidxLibraryAccessors getAndroidx() { return laccForAndroidxLibraryAccessors; }

    /**
     * Returns the group of libraries at com
     */
    public ComLibraryAccessors getCom() { return laccForComLibraryAccessors; }

    /**
     * Returns the group of libraries at dev
     */
    public DevLibraryAccessors getDev() { return laccForDevLibraryAccessors; }

    /**
     * Returns the group of libraries at io
     */
    public IoLibraryAccessors getIo() { return laccForIoLibraryAccessors; }

    /**
     * Returns the group of libraries at javax
     */
    public JavaxLibraryAccessors getJavax() { return laccForJavaxLibraryAccessors; }

    /**
     * Returns the group of libraries at org
     */
    public OrgLibraryAccessors getOrg() { return laccForOrgLibraryAccessors; }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() { return vaccForVersionAccessors; }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() { return baccForBundleAccessors; }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() { return paccForPluginAccessors; }

    public static class AndroidxLibraryAccessors extends SubDependencyFactory {
        private final AndroidxActivityLibraryAccessors laccForAndroidxActivityLibraryAccessors = new AndroidxActivityLibraryAccessors(owner);
        private final AndroidxAnnotationLibraryAccessors laccForAndroidxAnnotationLibraryAccessors = new AndroidxAnnotationLibraryAccessors(owner);
        private final AndroidxAppcompatLibraryAccessors laccForAndroidxAppcompatLibraryAccessors = new AndroidxAppcompatLibraryAccessors(owner);
        private final AndroidxArchLibraryAccessors laccForAndroidxArchLibraryAccessors = new AndroidxArchLibraryAccessors(owner);
        private final AndroidxCameraLibraryAccessors laccForAndroidxCameraLibraryAccessors = new AndroidxCameraLibraryAccessors(owner);
        private final AndroidxCollectionLibraryAccessors laccForAndroidxCollectionLibraryAccessors = new AndroidxCollectionLibraryAccessors(owner);
        private final AndroidxComposeLibraryAccessors laccForAndroidxComposeLibraryAccessors = new AndroidxComposeLibraryAccessors(owner);
        private final AndroidxConcurrentLibraryAccessors laccForAndroidxConcurrentLibraryAccessors = new AndroidxConcurrentLibraryAccessors(owner);
        private final AndroidxConstraintlayoutLibraryAccessors laccForAndroidxConstraintlayoutLibraryAccessors = new AndroidxConstraintlayoutLibraryAccessors(owner);
        private final AndroidxCoreLibraryAccessors laccForAndroidxCoreLibraryAccessors = new AndroidxCoreLibraryAccessors(owner);
        private final AndroidxCustomviewLibraryAccessors laccForAndroidxCustomviewLibraryAccessors = new AndroidxCustomviewLibraryAccessors(owner);
        private final AndroidxDatabindingLibraryAccessors laccForAndroidxDatabindingLibraryAccessors = new AndroidxDatabindingLibraryAccessors(owner);
        private final AndroidxFragmentLibraryAccessors laccForAndroidxFragmentLibraryAccessors = new AndroidxFragmentLibraryAccessors(owner);
        private final AndroidxHiltLibraryAccessors laccForAndroidxHiltLibraryAccessors = new AndroidxHiltLibraryAccessors(owner);
        private final AndroidxLegacyLibraryAccessors laccForAndroidxLegacyLibraryAccessors = new AndroidxLegacyLibraryAccessors(owner);
        private final AndroidxLifecycleLibraryAccessors laccForAndroidxLifecycleLibraryAccessors = new AndroidxLifecycleLibraryAccessors(owner);
        private final AndroidxNavigationLibraryAccessors laccForAndroidxNavigationLibraryAccessors = new AndroidxNavigationLibraryAccessors(owner);
        private final AndroidxPagingLibraryAccessors laccForAndroidxPagingLibraryAccessors = new AndroidxPagingLibraryAccessors(owner);
        private final AndroidxPaletteLibraryAccessors laccForAndroidxPaletteLibraryAccessors = new AndroidxPaletteLibraryAccessors(owner);
        private final AndroidxRoomLibraryAccessors laccForAndroidxRoomLibraryAccessors = new AndroidxRoomLibraryAccessors(owner);
        private final AndroidxSavedstateLibraryAccessors laccForAndroidxSavedstateLibraryAccessors = new AndroidxSavedstateLibraryAccessors(owner);
        private final AndroidxSqliteLibraryAccessors laccForAndroidxSqliteLibraryAccessors = new AndroidxSqliteLibraryAccessors(owner);
        private final AndroidxStartupLibraryAccessors laccForAndroidxStartupLibraryAccessors = new AndroidxStartupLibraryAccessors(owner);
        private final AndroidxTestLibraryAccessors laccForAndroidxTestLibraryAccessors = new AndroidxTestLibraryAccessors(owner);
        private final AndroidxVectordrawableLibraryAccessors laccForAndroidxVectordrawableLibraryAccessors = new AndroidxVectordrawableLibraryAccessors(owner);

        public AndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for autofill (androidx.autofill:autofill)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAutofill() { return create("androidx.autofill"); }

            /**
             * Creates a dependency provider for cardview (androidx.cardview:cardview)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCardview() { return create("androidx.cardview"); }

            /**
             * Creates a dependency provider for coordinatorlayout (androidx.coordinatorlayout:coordinatorlayout)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCoordinatorlayout() { return create("androidx.coordinatorlayout"); }

            /**
             * Creates a dependency provider for cursoradapter (androidx.cursoradapter:cursoradapter)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCursoradapter() { return create("androidx.cursoradapter"); }

            /**
             * Creates a dependency provider for documentfile (androidx.documentfile:documentfile)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDocumentfile() { return create("androidx.documentfile"); }

            /**
             * Creates a dependency provider for drawerlayout (androidx.drawerlayout:drawerlayout)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDrawerlayout() { return create("androidx.drawerlayout"); }

            /**
             * Creates a dependency provider for dynamicanimation (androidx.dynamicanimation:dynamicanimation)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDynamicanimation() { return create("androidx.dynamicanimation"); }

            /**
             * Creates a dependency provider for exifinterface (androidx.exifinterface:exifinterface)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getExifinterface() { return create("androidx.exifinterface"); }

            /**
             * Creates a dependency provider for interpolator (androidx.interpolator:interpolator)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getInterpolator() { return create("androidx.interpolator"); }

            /**
             * Creates a dependency provider for loader (androidx.loader:loader)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLoader() { return create("androidx.loader"); }

            /**
             * Creates a dependency provider for localbroadcastmanager (androidx.localbroadcastmanager:localbroadcastmanager)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLocalbroadcastmanager() { return create("androidx.localbroadcastmanager"); }

            /**
             * Creates a dependency provider for print (androidx.print:print)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPrint() { return create("androidx.print"); }

            /**
             * Creates a dependency provider for profileinstaller (androidx.profileinstaller:profileinstaller)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getProfileinstaller() { return create("androidx.profileinstaller"); }

            /**
             * Creates a dependency provider for recyclerview (androidx.recyclerview:recyclerview)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRecyclerview() { return create("androidx.recyclerview"); }

            /**
             * Creates a dependency provider for tracing (androidx.tracing:tracing)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTracing() { return create("androidx.tracing"); }

            /**
             * Creates a dependency provider for transition (androidx.transition:transition)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTransition() { return create("androidx.transition"); }

            /**
             * Creates a dependency provider for versionedparcelable (androidx.versionedparcelable:versionedparcelable)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getVersionedparcelable() { return create("androidx.versionedparcelable"); }

            /**
             * Creates a dependency provider for viewpager (androidx.viewpager:viewpager)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getViewpager() { return create("androidx.viewpager"); }

            /**
             * Creates a dependency provider for viewpager2 (androidx.viewpager2:viewpager2)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getViewpager2() { return create("androidx.viewpager2"); }

        /**
         * Returns the group of libraries at androidx.activity
         */
        public AndroidxActivityLibraryAccessors getActivity() { return laccForAndroidxActivityLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.annotation
         */
        public AndroidxAnnotationLibraryAccessors getAnnotation() { return laccForAndroidxAnnotationLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.appcompat
         */
        public AndroidxAppcompatLibraryAccessors getAppcompat() { return laccForAndroidxAppcompatLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.arch
         */
        public AndroidxArchLibraryAccessors getArch() { return laccForAndroidxArchLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.camera
         */
        public AndroidxCameraLibraryAccessors getCamera() { return laccForAndroidxCameraLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.collection
         */
        public AndroidxCollectionLibraryAccessors getCollection() { return laccForAndroidxCollectionLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.compose
         */
        public AndroidxComposeLibraryAccessors getCompose() { return laccForAndroidxComposeLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.concurrent
         */
        public AndroidxConcurrentLibraryAccessors getConcurrent() { return laccForAndroidxConcurrentLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.constraintlayout
         */
        public AndroidxConstraintlayoutLibraryAccessors getConstraintlayout() { return laccForAndroidxConstraintlayoutLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.core
         */
        public AndroidxCoreLibraryAccessors getCore() { return laccForAndroidxCoreLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.customview
         */
        public AndroidxCustomviewLibraryAccessors getCustomview() { return laccForAndroidxCustomviewLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.databinding
         */
        public AndroidxDatabindingLibraryAccessors getDatabinding() { return laccForAndroidxDatabindingLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.fragment
         */
        public AndroidxFragmentLibraryAccessors getFragment() { return laccForAndroidxFragmentLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.hilt
         */
        public AndroidxHiltLibraryAccessors getHilt() { return laccForAndroidxHiltLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.legacy
         */
        public AndroidxLegacyLibraryAccessors getLegacy() { return laccForAndroidxLegacyLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.lifecycle
         */
        public AndroidxLifecycleLibraryAccessors getLifecycle() { return laccForAndroidxLifecycleLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.navigation
         */
        public AndroidxNavigationLibraryAccessors getNavigation() { return laccForAndroidxNavigationLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.paging
         */
        public AndroidxPagingLibraryAccessors getPaging() { return laccForAndroidxPagingLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.palette
         */
        public AndroidxPaletteLibraryAccessors getPalette() { return laccForAndroidxPaletteLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.room
         */
        public AndroidxRoomLibraryAccessors getRoom() { return laccForAndroidxRoomLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.savedstate
         */
        public AndroidxSavedstateLibraryAccessors getSavedstate() { return laccForAndroidxSavedstateLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.sqlite
         */
        public AndroidxSqliteLibraryAccessors getSqlite() { return laccForAndroidxSqliteLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.startup
         */
        public AndroidxStartupLibraryAccessors getStartup() { return laccForAndroidxStartupLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.test
         */
        public AndroidxTestLibraryAccessors getTest() { return laccForAndroidxTestLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.vectordrawable
         */
        public AndroidxVectordrawableLibraryAccessors getVectordrawable() { return laccForAndroidxVectordrawableLibraryAccessors; }

    }

    public static class AndroidxActivityLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final AndroidxActivityActivityLibraryAccessors laccForAndroidxActivityActivityLibraryAccessors = new AndroidxActivityActivityLibraryAccessors(owner);

        public AndroidxActivityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for activity (androidx.activity:activity)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.activity"); }

        /**
         * Returns the group of libraries at androidx.activity.activity
         */
        public AndroidxActivityActivityLibraryAccessors getActivity() { return laccForAndroidxActivityActivityLibraryAccessors; }

    }

    public static class AndroidxActivityActivityLibraryAccessors extends SubDependencyFactory {

        public AndroidxActivityActivityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (androidx.activity:activity-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("androidx.activity.activity.compose"); }

            /**
             * Creates a dependency provider for ktx (androidx.activity:activity-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx.activity.activity.ktx"); }

    }

    public static class AndroidxAnnotationLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final AndroidxAnnotationAnnotationLibraryAccessors laccForAndroidxAnnotationAnnotationLibraryAccessors = new AndroidxAnnotationAnnotationLibraryAccessors(owner);

        public AndroidxAnnotationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for annotation (androidx.annotation:annotation)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.annotation"); }

        /**
         * Returns the group of libraries at androidx.annotation.annotation
         */
        public AndroidxAnnotationAnnotationLibraryAccessors getAnnotation() { return laccForAndroidxAnnotationAnnotationLibraryAccessors; }

    }

    public static class AndroidxAnnotationAnnotationLibraryAccessors extends SubDependencyFactory {

        public AndroidxAnnotationAnnotationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for experimental (androidx.annotation:annotation-experimental)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getExperimental() { return create("androidx.annotation.annotation.experimental"); }

    }

    public static class AndroidxAppcompatLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final AndroidxAppcompatAppcompatLibraryAccessors laccForAndroidxAppcompatAppcompatLibraryAccessors = new AndroidxAppcompatAppcompatLibraryAccessors(owner);

        public AndroidxAppcompatLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for appcompat (androidx.appcompat:appcompat)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.appcompat"); }

        /**
         * Returns the group of libraries at androidx.appcompat.appcompat
         */
        public AndroidxAppcompatAppcompatLibraryAccessors getAppcompat() { return laccForAndroidxAppcompatAppcompatLibraryAccessors; }

    }

    public static class AndroidxAppcompatAppcompatLibraryAccessors extends SubDependencyFactory {

        public AndroidxAppcompatAppcompatLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for resources (androidx.appcompat:appcompat-resources)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getResources() { return create("androidx.appcompat.appcompat.resources"); }

    }

    public static class AndroidxArchLibraryAccessors extends SubDependencyFactory {
        private final AndroidxArchCoreLibraryAccessors laccForAndroidxArchCoreLibraryAccessors = new AndroidxArchCoreLibraryAccessors(owner);

        public AndroidxArchLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.arch.core
         */
        public AndroidxArchCoreLibraryAccessors getCore() { return laccForAndroidxArchCoreLibraryAccessors; }

    }

    public static class AndroidxArchCoreLibraryAccessors extends SubDependencyFactory {
        private final AndroidxArchCoreCoreLibraryAccessors laccForAndroidxArchCoreCoreLibraryAccessors = new AndroidxArchCoreCoreLibraryAccessors(owner);

        public AndroidxArchCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.arch.core.core
         */
        public AndroidxArchCoreCoreLibraryAccessors getCore() { return laccForAndroidxArchCoreCoreLibraryAccessors; }

    }

    public static class AndroidxArchCoreCoreLibraryAccessors extends SubDependencyFactory {

        public AndroidxArchCoreCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for common (androidx.arch.core:core-common)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCommon() { return create("androidx.arch.core.core.common"); }

            /**
             * Creates a dependency provider for runtime (androidx.arch.core:core-runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() { return create("androidx.arch.core.core.runtime"); }

    }

    public static class AndroidxCameraLibraryAccessors extends SubDependencyFactory {
        private final AndroidxCameraCameraLibraryAccessors laccForAndroidxCameraCameraLibraryAccessors = new AndroidxCameraCameraLibraryAccessors(owner);

        public AndroidxCameraLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.camera.camera
         */
        public AndroidxCameraCameraLibraryAccessors getCamera() { return laccForAndroidxCameraCameraLibraryAccessors; }

    }

    public static class AndroidxCameraCameraLibraryAccessors extends SubDependencyFactory {

        public AndroidxCameraCameraLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for camera2 (androidx.camera:camera-camera2)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCamera2() { return create("androidx.camera.camera.camera2"); }

            /**
             * Creates a dependency provider for core (androidx.camera:camera-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("androidx.camera.camera.core"); }

            /**
             * Creates a dependency provider for extensions (androidx.camera:camera-extensions)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getExtensions() { return create("androidx.camera.camera.extensions"); }

            /**
             * Creates a dependency provider for lifecycle (androidx.camera:camera-lifecycle)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLifecycle() { return create("androidx.camera.camera.lifecycle"); }

            /**
             * Creates a dependency provider for video (androidx.camera:camera-video)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getVideo() { return create("androidx.camera.camera.video"); }

            /**
             * Creates a dependency provider for view (androidx.camera:camera-view)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getView() { return create("androidx.camera.camera.view"); }

    }

    public static class AndroidxCollectionLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final AndroidxCollectionCollectionLibraryAccessors laccForAndroidxCollectionCollectionLibraryAccessors = new AndroidxCollectionCollectionLibraryAccessors(owner);

        public AndroidxCollectionLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for collection (androidx.collection:collection)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.collection"); }

        /**
         * Returns the group of libraries at androidx.collection.collection
         */
        public AndroidxCollectionCollectionLibraryAccessors getCollection() { return laccForAndroidxCollectionCollectionLibraryAccessors; }

    }

    public static class AndroidxCollectionCollectionLibraryAccessors extends SubDependencyFactory {

        public AndroidxCollectionCollectionLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.collection:collection-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx.collection.collection.ktx"); }

    }

    public static class AndroidxComposeLibraryAccessors extends SubDependencyFactory {
        private final AndroidxComposeAnimationLibraryAccessors laccForAndroidxComposeAnimationLibraryAccessors = new AndroidxComposeAnimationLibraryAccessors(owner);
        private final AndroidxComposeFoundationLibraryAccessors laccForAndroidxComposeFoundationLibraryAccessors = new AndroidxComposeFoundationLibraryAccessors(owner);
        private final AndroidxComposeMaterialLibraryAccessors laccForAndroidxComposeMaterialLibraryAccessors = new AndroidxComposeMaterialLibraryAccessors(owner);
        private final AndroidxComposeRuntimeLibraryAccessors laccForAndroidxComposeRuntimeLibraryAccessors = new AndroidxComposeRuntimeLibraryAccessors(owner);
        private final AndroidxComposeUiLibraryAccessors laccForAndroidxComposeUiLibraryAccessors = new AndroidxComposeUiLibraryAccessors(owner);

        public AndroidxComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compiler (androidx.compose.compiler:compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() { return create("androidx.compose.compiler"); }

            /**
             * Creates a dependency provider for material3 (androidx.compose.material3:material3)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterial3() { return create("androidx.compose.material3"); }

        /**
         * Returns the group of libraries at androidx.compose.animation
         */
        public AndroidxComposeAnimationLibraryAccessors getAnimation() { return laccForAndroidxComposeAnimationLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.compose.foundation
         */
        public AndroidxComposeFoundationLibraryAccessors getFoundation() { return laccForAndroidxComposeFoundationLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.compose.material
         */
        public AndroidxComposeMaterialLibraryAccessors getMaterial() { return laccForAndroidxComposeMaterialLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.compose.runtime
         */
        public AndroidxComposeRuntimeLibraryAccessors getRuntime() { return laccForAndroidxComposeRuntimeLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.compose.ui
         */
        public AndroidxComposeUiLibraryAccessors getUi() { return laccForAndroidxComposeUiLibraryAccessors; }

    }

    public static class AndroidxComposeAnimationLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final AndroidxComposeAnimationAnimationLibraryAccessors laccForAndroidxComposeAnimationAnimationLibraryAccessors = new AndroidxComposeAnimationAnimationLibraryAccessors(owner);

        public AndroidxComposeAnimationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for animation (androidx.compose.animation:animation)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.compose.animation"); }

        /**
         * Returns the group of libraries at androidx.compose.animation.animation
         */
        public AndroidxComposeAnimationAnimationLibraryAccessors getAnimation() { return laccForAndroidxComposeAnimationAnimationLibraryAccessors; }

    }

    public static class AndroidxComposeAnimationAnimationLibraryAccessors extends SubDependencyFactory {

        public AndroidxComposeAnimationAnimationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (androidx.compose.animation:animation-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("androidx.compose.animation.animation.core"); }

    }

    public static class AndroidxComposeFoundationLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final AndroidxComposeFoundationFoundationLibraryAccessors laccForAndroidxComposeFoundationFoundationLibraryAccessors = new AndroidxComposeFoundationFoundationLibraryAccessors(owner);

        public AndroidxComposeFoundationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for foundation (androidx.compose.foundation:foundation)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.compose.foundation"); }

        /**
         * Returns the group of libraries at androidx.compose.foundation.foundation
         */
        public AndroidxComposeFoundationFoundationLibraryAccessors getFoundation() { return laccForAndroidxComposeFoundationFoundationLibraryAccessors; }

    }

    public static class AndroidxComposeFoundationFoundationLibraryAccessors extends SubDependencyFactory {

        public AndroidxComposeFoundationFoundationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for layout (androidx.compose.foundation:foundation-layout)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLayout() { return create("androidx.compose.foundation.foundation.layout"); }

    }

    public static class AndroidxComposeMaterialLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final AndroidxComposeMaterialMaterialLibraryAccessors laccForAndroidxComposeMaterialMaterialLibraryAccessors = new AndroidxComposeMaterialMaterialLibraryAccessors(owner);

        public AndroidxComposeMaterialLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for material (androidx.compose.material:material)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.compose.material"); }

        /**
         * Returns the group of libraries at androidx.compose.material.material
         */
        public AndroidxComposeMaterialMaterialLibraryAccessors getMaterial() { return laccForAndroidxComposeMaterialMaterialLibraryAccessors; }

    }

    public static class AndroidxComposeMaterialMaterialLibraryAccessors extends SubDependencyFactory {
        private final AndroidxComposeMaterialMaterialIconsLibraryAccessors laccForAndroidxComposeMaterialMaterialIconsLibraryAccessors = new AndroidxComposeMaterialMaterialIconsLibraryAccessors(owner);

        public AndroidxComposeMaterialMaterialLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ripple (androidx.compose.material:material-ripple)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRipple() { return create("androidx.compose.material.material.ripple"); }

        /**
         * Returns the group of libraries at androidx.compose.material.material.icons
         */
        public AndroidxComposeMaterialMaterialIconsLibraryAccessors getIcons() { return laccForAndroidxComposeMaterialMaterialIconsLibraryAccessors; }

    }

    public static class AndroidxComposeMaterialMaterialIconsLibraryAccessors extends SubDependencyFactory {

        public AndroidxComposeMaterialMaterialIconsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (androidx.compose.material:material-icons-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("androidx.compose.material.material.icons.core"); }

            /**
             * Creates a dependency provider for extended (androidx.compose.material:material-icons-extended)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getExtended() { return create("androidx.compose.material.material.icons.extended"); }

    }

    public static class AndroidxComposeRuntimeLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final AndroidxComposeRuntimeRuntimeLibraryAccessors laccForAndroidxComposeRuntimeRuntimeLibraryAccessors = new AndroidxComposeRuntimeRuntimeLibraryAccessors(owner);

        public AndroidxComposeRuntimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for runtime (androidx.compose.runtime:runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.compose.runtime"); }

        /**
         * Returns the group of libraries at androidx.compose.runtime.runtime
         */
        public AndroidxComposeRuntimeRuntimeLibraryAccessors getRuntime() { return laccForAndroidxComposeRuntimeRuntimeLibraryAccessors; }

    }

    public static class AndroidxComposeRuntimeRuntimeLibraryAccessors extends SubDependencyFactory {

        public AndroidxComposeRuntimeRuntimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for saveable (androidx.compose.runtime:runtime-saveable)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSaveable() { return create("androidx.compose.runtime.runtime.saveable"); }

    }

    public static class AndroidxComposeUiLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final AndroidxComposeUiUiLibraryAccessors laccForAndroidxComposeUiUiLibraryAccessors = new AndroidxComposeUiUiLibraryAccessors(owner);

        public AndroidxComposeUiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ui (androidx.compose.ui:ui)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.compose.ui"); }

        /**
         * Returns the group of libraries at androidx.compose.ui.ui
         */
        public AndroidxComposeUiUiLibraryAccessors getUi() { return laccForAndroidxComposeUiUiLibraryAccessors; }

    }

    public static class AndroidxComposeUiUiLibraryAccessors extends SubDependencyFactory {
        private final AndroidxComposeUiUiTestLibraryAccessors laccForAndroidxComposeUiUiTestLibraryAccessors = new AndroidxComposeUiUiTestLibraryAccessors(owner);
        private final AndroidxComposeUiUiToolingLibraryAccessors laccForAndroidxComposeUiUiToolingLibraryAccessors = new AndroidxComposeUiUiToolingLibraryAccessors(owner);

        public AndroidxComposeUiUiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for geometry (androidx.compose.ui:ui-geometry)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGeometry() { return create("androidx.compose.ui.ui.geometry"); }

            /**
             * Creates a dependency provider for graphics (androidx.compose.ui:ui-graphics)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGraphics() { return create("androidx.compose.ui.ui.graphics"); }

            /**
             * Creates a dependency provider for text (androidx.compose.ui:ui-text)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getText() { return create("androidx.compose.ui.ui.text"); }

            /**
             * Creates a dependency provider for unit (androidx.compose.ui:ui-unit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getUnit() { return create("androidx.compose.ui.ui.unit"); }

            /**
             * Creates a dependency provider for util (androidx.compose.ui:ui-util)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getUtil() { return create("androidx.compose.ui.ui.util"); }

        /**
         * Returns the group of libraries at androidx.compose.ui.ui.test
         */
        public AndroidxComposeUiUiTestLibraryAccessors getTest() { return laccForAndroidxComposeUiUiTestLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.compose.ui.ui.tooling
         */
        public AndroidxComposeUiUiToolingLibraryAccessors getTooling() { return laccForAndroidxComposeUiUiToolingLibraryAccessors; }

    }

    public static class AndroidxComposeUiUiTestLibraryAccessors extends SubDependencyFactory {

        public AndroidxComposeUiUiTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for junit4 (androidx.compose.ui:ui-test-junit4)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit4() { return create("androidx.compose.ui.ui.test.junit4"); }

            /**
             * Creates a dependency provider for manifest (androidx.compose.ui:ui-test-manifest)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getManifest() { return create("androidx.compose.ui.ui.test.manifest"); }

    }

    public static class AndroidxComposeUiUiToolingLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public AndroidxComposeUiUiToolingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for tooling (androidx.compose.ui:ui-tooling)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.compose.ui.ui.tooling"); }

            /**
             * Creates a dependency provider for data (androidx.compose.ui:ui-tooling-data)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getData() { return create("androidx.compose.ui.ui.tooling.data"); }

            /**
             * Creates a dependency provider for preview (androidx.compose.ui:ui-tooling-preview)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPreview() { return create("androidx.compose.ui.ui.tooling.preview"); }

    }

    public static class AndroidxConcurrentLibraryAccessors extends SubDependencyFactory {
        private final AndroidxConcurrentConcurrentLibraryAccessors laccForAndroidxConcurrentConcurrentLibraryAccessors = new AndroidxConcurrentConcurrentLibraryAccessors(owner);

        public AndroidxConcurrentLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.concurrent.concurrent
         */
        public AndroidxConcurrentConcurrentLibraryAccessors getConcurrent() { return laccForAndroidxConcurrentConcurrentLibraryAccessors; }

    }

    public static class AndroidxConcurrentConcurrentLibraryAccessors extends SubDependencyFactory {

        public AndroidxConcurrentConcurrentLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for futures (androidx.concurrent:concurrent-futures)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getFutures() { return create("androidx.concurrent.concurrent.futures"); }

    }

    public static class AndroidxConstraintlayoutLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final AndroidxConstraintlayoutConstraintlayoutLibraryAccessors laccForAndroidxConstraintlayoutConstraintlayoutLibraryAccessors = new AndroidxConstraintlayoutConstraintlayoutLibraryAccessors(owner);

        public AndroidxConstraintlayoutLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for constraintlayout (androidx.constraintlayout:constraintlayout)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.constraintlayout"); }

        /**
         * Returns the group of libraries at androidx.constraintlayout.constraintlayout
         */
        public AndroidxConstraintlayoutConstraintlayoutLibraryAccessors getConstraintlayout() { return laccForAndroidxConstraintlayoutConstraintlayoutLibraryAccessors; }

    }

    public static class AndroidxConstraintlayoutConstraintlayoutLibraryAccessors extends SubDependencyFactory {

        public AndroidxConstraintlayoutConstraintlayoutLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (androidx.constraintlayout:constraintlayout-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("androidx.constraintlayout.constraintlayout.compose"); }

            /**
             * Creates a dependency provider for core (androidx.constraintlayout:constraintlayout-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("androidx.constraintlayout.constraintlayout.core"); }

            /**
             * Creates a dependency provider for solver (androidx.constraintlayout:constraintlayout-solver)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSolver() { return create("androidx.constraintlayout.constraintlayout.solver"); }

    }

    public static class AndroidxCoreLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final AndroidxCoreCoreLibraryAccessors laccForAndroidxCoreCoreLibraryAccessors = new AndroidxCoreCoreLibraryAccessors(owner);

        public AndroidxCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (androidx.core:core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.core"); }

        /**
         * Returns the group of libraries at androidx.core.core
         */
        public AndroidxCoreCoreLibraryAccessors getCore() { return laccForAndroidxCoreCoreLibraryAccessors; }

    }

    public static class AndroidxCoreCoreLibraryAccessors extends SubDependencyFactory {

        public AndroidxCoreCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.core:core-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx.core.core.ktx"); }

    }

    public static class AndroidxCustomviewLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final AndroidxCustomviewCustomviewLibraryAccessors laccForAndroidxCustomviewCustomviewLibraryAccessors = new AndroidxCustomviewCustomviewLibraryAccessors(owner);

        public AndroidxCustomviewLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for customview (androidx.customview:customview)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.customview"); }

        /**
         * Returns the group of libraries at androidx.customview.customview
         */
        public AndroidxCustomviewCustomviewLibraryAccessors getCustomview() { return laccForAndroidxCustomviewCustomviewLibraryAccessors; }

    }

    public static class AndroidxCustomviewCustomviewLibraryAccessors extends SubDependencyFactory {

        public AndroidxCustomviewCustomviewLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for poolingcontainer (androidx.customview:customview-poolingcontainer)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPoolingcontainer() { return create("androidx.customview.customview.poolingcontainer"); }

    }

    public static class AndroidxDatabindingLibraryAccessors extends SubDependencyFactory {

        public AndroidxDatabindingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for viewbinding (androidx.databinding:viewbinding)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getViewbinding() { return create("androidx.databinding.viewbinding"); }

    }

    public static class AndroidxFragmentLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final AndroidxFragmentFragmentLibraryAccessors laccForAndroidxFragmentFragmentLibraryAccessors = new AndroidxFragmentFragmentLibraryAccessors(owner);

        public AndroidxFragmentLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for fragment (androidx.fragment:fragment)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.fragment"); }

        /**
         * Returns the group of libraries at androidx.fragment.fragment
         */
        public AndroidxFragmentFragmentLibraryAccessors getFragment() { return laccForAndroidxFragmentFragmentLibraryAccessors; }

    }

    public static class AndroidxFragmentFragmentLibraryAccessors extends SubDependencyFactory {

        public AndroidxFragmentFragmentLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.fragment:fragment-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx.fragment.fragment.ktx"); }

    }

    public static class AndroidxHiltLibraryAccessors extends SubDependencyFactory {
        private final AndroidxHiltHiltLibraryAccessors laccForAndroidxHiltHiltLibraryAccessors = new AndroidxHiltHiltLibraryAccessors(owner);

        public AndroidxHiltLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.hilt.hilt
         */
        public AndroidxHiltHiltLibraryAccessors getHilt() { return laccForAndroidxHiltHiltLibraryAccessors; }

    }

    public static class AndroidxHiltHiltLibraryAccessors extends SubDependencyFactory {
        private final AndroidxHiltHiltNavigationLibraryAccessors laccForAndroidxHiltHiltNavigationLibraryAccessors = new AndroidxHiltHiltNavigationLibraryAccessors(owner);

        public AndroidxHiltHiltLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compiler (androidx.hilt:hilt-compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() { return create("androidx.hilt.hilt.compiler"); }

        /**
         * Returns the group of libraries at androidx.hilt.hilt.navigation
         */
        public AndroidxHiltHiltNavigationLibraryAccessors getNavigation() { return laccForAndroidxHiltHiltNavigationLibraryAccessors; }

    }

    public static class AndroidxHiltHiltNavigationLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public AndroidxHiltHiltNavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for navigation (androidx.hilt:hilt-navigation)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.hilt.hilt.navigation"); }

            /**
             * Creates a dependency provider for compose (androidx.hilt:hilt-navigation-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("androidx.hilt.hilt.navigation.compose"); }

    }

    public static class AndroidxLegacyLibraryAccessors extends SubDependencyFactory {
        private final AndroidxLegacyLegacyLibraryAccessors laccForAndroidxLegacyLegacyLibraryAccessors = new AndroidxLegacyLegacyLibraryAccessors(owner);

        public AndroidxLegacyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.legacy.legacy
         */
        public AndroidxLegacyLegacyLibraryAccessors getLegacy() { return laccForAndroidxLegacyLegacyLibraryAccessors; }

    }

    public static class AndroidxLegacyLegacyLibraryAccessors extends SubDependencyFactory {
        private final AndroidxLegacyLegacySupportLibraryAccessors laccForAndroidxLegacyLegacySupportLibraryAccessors = new AndroidxLegacyLegacySupportLibraryAccessors(owner);

        public AndroidxLegacyLegacyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.legacy.legacy.support
         */
        public AndroidxLegacyLegacySupportLibraryAccessors getSupport() { return laccForAndroidxLegacyLegacySupportLibraryAccessors; }

    }

    public static class AndroidxLegacyLegacySupportLibraryAccessors extends SubDependencyFactory {
        private final AndroidxLegacyLegacySupportCoreLibraryAccessors laccForAndroidxLegacyLegacySupportCoreLibraryAccessors = new AndroidxLegacyLegacySupportCoreLibraryAccessors(owner);

        public AndroidxLegacyLegacySupportLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.legacy.legacy.support.core
         */
        public AndroidxLegacyLegacySupportCoreLibraryAccessors getCore() { return laccForAndroidxLegacyLegacySupportCoreLibraryAccessors; }

    }

    public static class AndroidxLegacyLegacySupportCoreLibraryAccessors extends SubDependencyFactory {

        public AndroidxLegacyLegacySupportCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for utils (androidx.legacy:legacy-support-core-utils)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getUtils() { return create("androidx.legacy.legacy.support.core.utils"); }

    }

    public static class AndroidxLifecycleLibraryAccessors extends SubDependencyFactory {
        private final AndroidxLifecycleLifecycleLibraryAccessors laccForAndroidxLifecycleLifecycleLibraryAccessors = new AndroidxLifecycleLifecycleLibraryAccessors(owner);

        public AndroidxLifecycleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.lifecycle.lifecycle
         */
        public AndroidxLifecycleLifecycleLibraryAccessors getLifecycle() { return laccForAndroidxLifecycleLifecycleLibraryAccessors; }

    }

    public static class AndroidxLifecycleLifecycleLibraryAccessors extends SubDependencyFactory {
        private final AndroidxLifecycleLifecycleCommonLibraryAccessors laccForAndroidxLifecycleLifecycleCommonLibraryAccessors = new AndroidxLifecycleLifecycleCommonLibraryAccessors(owner);
        private final AndroidxLifecycleLifecycleLivedataLibraryAccessors laccForAndroidxLifecycleLifecycleLivedataLibraryAccessors = new AndroidxLifecycleLifecycleLivedataLibraryAccessors(owner);
        private final AndroidxLifecycleLifecycleRuntimeLibraryAccessors laccForAndroidxLifecycleLifecycleRuntimeLibraryAccessors = new AndroidxLifecycleLifecycleRuntimeLibraryAccessors(owner);
        private final AndroidxLifecycleLifecycleViewmodelLibraryAccessors laccForAndroidxLifecycleLifecycleViewmodelLibraryAccessors = new AndroidxLifecycleLifecycleViewmodelLibraryAccessors(owner);

        public AndroidxLifecycleLifecycleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.lifecycle.lifecycle.common
         */
        public AndroidxLifecycleLifecycleCommonLibraryAccessors getCommon() { return laccForAndroidxLifecycleLifecycleCommonLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.lifecycle.lifecycle.livedata
         */
        public AndroidxLifecycleLifecycleLivedataLibraryAccessors getLivedata() { return laccForAndroidxLifecycleLifecycleLivedataLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.lifecycle.lifecycle.runtime
         */
        public AndroidxLifecycleLifecycleRuntimeLibraryAccessors getRuntime() { return laccForAndroidxLifecycleLifecycleRuntimeLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.lifecycle.lifecycle.viewmodel
         */
        public AndroidxLifecycleLifecycleViewmodelLibraryAccessors getViewmodel() { return laccForAndroidxLifecycleLifecycleViewmodelLibraryAccessors; }

    }

    public static class AndroidxLifecycleLifecycleCommonLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public AndroidxLifecycleLifecycleCommonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for common (androidx.lifecycle:lifecycle-common)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.lifecycle.lifecycle.common"); }

            /**
             * Creates a dependency provider for java8 (androidx.lifecycle:lifecycle-common-java8)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJava8() { return create("androidx.lifecycle.lifecycle.common.java8"); }

    }

    public static class AndroidxLifecycleLifecycleLivedataLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final AndroidxLifecycleLifecycleLivedataCoreLibraryAccessors laccForAndroidxLifecycleLifecycleLivedataCoreLibraryAccessors = new AndroidxLifecycleLifecycleLivedataCoreLibraryAccessors(owner);

        public AndroidxLifecycleLifecycleLivedataLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for livedata (androidx.lifecycle:lifecycle-livedata)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.lifecycle.lifecycle.livedata"); }

            /**
             * Creates a dependency provider for ktx (androidx.lifecycle:lifecycle-livedata-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx.lifecycle.lifecycle.livedata.ktx"); }

        /**
         * Returns the group of libraries at androidx.lifecycle.lifecycle.livedata.core
         */
        public AndroidxLifecycleLifecycleLivedataCoreLibraryAccessors getCore() { return laccForAndroidxLifecycleLifecycleLivedataCoreLibraryAccessors; }

    }

    public static class AndroidxLifecycleLifecycleLivedataCoreLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public AndroidxLifecycleLifecycleLivedataCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (androidx.lifecycle:lifecycle-livedata-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.lifecycle.lifecycle.livedata.core"); }

            /**
             * Creates a dependency provider for ktx (androidx.lifecycle:lifecycle-livedata-core-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx.lifecycle.lifecycle.livedata.core.ktx"); }

    }

    public static class AndroidxLifecycleLifecycleRuntimeLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public AndroidxLifecycleLifecycleRuntimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for runtime (androidx.lifecycle:lifecycle-runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.lifecycle.lifecycle.runtime"); }

            /**
             * Creates a dependency provider for compose (androidx.lifecycle:lifecycle-runtime-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("androidx.lifecycle.lifecycle.runtime.compose"); }

            /**
             * Creates a dependency provider for ktx (androidx.lifecycle:lifecycle-runtime-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx.lifecycle.lifecycle.runtime.ktx"); }

    }

    public static class AndroidxLifecycleLifecycleViewmodelLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public AndroidxLifecycleLifecycleViewmodelLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for viewmodel (androidx.lifecycle:lifecycle-viewmodel)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.lifecycle.lifecycle.viewmodel"); }

            /**
             * Creates a dependency provider for compose (androidx.lifecycle:lifecycle-viewmodel-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("androidx.lifecycle.lifecycle.viewmodel.compose"); }

            /**
             * Creates a dependency provider for ktx (androidx.lifecycle:lifecycle-viewmodel-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx.lifecycle.lifecycle.viewmodel.ktx"); }

            /**
             * Creates a dependency provider for savedstate (androidx.lifecycle:lifecycle-viewmodel-savedstate)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSavedstate() { return create("androidx.lifecycle.lifecycle.viewmodel.savedstate"); }

    }

    public static class AndroidxNavigationLibraryAccessors extends SubDependencyFactory {
        private final AndroidxNavigationNavigationLibraryAccessors laccForAndroidxNavigationNavigationLibraryAccessors = new AndroidxNavigationNavigationLibraryAccessors(owner);

        public AndroidxNavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.navigation.navigation
         */
        public AndroidxNavigationNavigationLibraryAccessors getNavigation() { return laccForAndroidxNavigationNavigationLibraryAccessors; }

    }

    public static class AndroidxNavigationNavigationLibraryAccessors extends SubDependencyFactory {
        private final AndroidxNavigationNavigationCommonLibraryAccessors laccForAndroidxNavigationNavigationCommonLibraryAccessors = new AndroidxNavigationNavigationCommonLibraryAccessors(owner);
        private final AndroidxNavigationNavigationRuntimeLibraryAccessors laccForAndroidxNavigationNavigationRuntimeLibraryAccessors = new AndroidxNavigationNavigationRuntimeLibraryAccessors(owner);

        public AndroidxNavigationNavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (androidx.navigation:navigation-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("androidx.navigation.navigation.compose"); }

        /**
         * Returns the group of libraries at androidx.navigation.navigation.common
         */
        public AndroidxNavigationNavigationCommonLibraryAccessors getCommon() { return laccForAndroidxNavigationNavigationCommonLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.navigation.navigation.runtime
         */
        public AndroidxNavigationNavigationRuntimeLibraryAccessors getRuntime() { return laccForAndroidxNavigationNavigationRuntimeLibraryAccessors; }

    }

    public static class AndroidxNavigationNavigationCommonLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public AndroidxNavigationNavigationCommonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for common (androidx.navigation:navigation-common)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.navigation.navigation.common"); }

            /**
             * Creates a dependency provider for ktx (androidx.navigation:navigation-common-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx.navigation.navigation.common.ktx"); }

    }

    public static class AndroidxNavigationNavigationRuntimeLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public AndroidxNavigationNavigationRuntimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for runtime (androidx.navigation:navigation-runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.navigation.navigation.runtime"); }

            /**
             * Creates a dependency provider for ktx (androidx.navigation:navigation-runtime-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx.navigation.navigation.runtime.ktx"); }

    }

    public static class AndroidxPagingLibraryAccessors extends SubDependencyFactory {
        private final AndroidxPagingPagingLibraryAccessors laccForAndroidxPagingPagingLibraryAccessors = new AndroidxPagingPagingLibraryAccessors(owner);

        public AndroidxPagingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.paging.paging
         */
        public AndroidxPagingPagingLibraryAccessors getPaging() { return laccForAndroidxPagingPagingLibraryAccessors; }

    }

    public static class AndroidxPagingPagingLibraryAccessors extends SubDependencyFactory {

        public AndroidxPagingPagingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for common (androidx.paging:paging-common)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCommon() { return create("androidx.paging.paging.common"); }

            /**
             * Creates a dependency provider for compose (androidx.paging:paging-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("androidx.paging.paging.compose"); }

    }

    public static class AndroidxPaletteLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final AndroidxPalettePaletteLibraryAccessors laccForAndroidxPalettePaletteLibraryAccessors = new AndroidxPalettePaletteLibraryAccessors(owner);

        public AndroidxPaletteLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for palette (androidx.palette:palette)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.palette"); }

        /**
         * Returns the group of libraries at androidx.palette.palette
         */
        public AndroidxPalettePaletteLibraryAccessors getPalette() { return laccForAndroidxPalettePaletteLibraryAccessors; }

    }

    public static class AndroidxPalettePaletteLibraryAccessors extends SubDependencyFactory {

        public AndroidxPalettePaletteLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.palette:palette-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx.palette.palette.ktx"); }

    }

    public static class AndroidxRoomLibraryAccessors extends SubDependencyFactory {
        private final AndroidxRoomRoomLibraryAccessors laccForAndroidxRoomRoomLibraryAccessors = new AndroidxRoomRoomLibraryAccessors(owner);

        public AndroidxRoomLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.room.room
         */
        public AndroidxRoomRoomLibraryAccessors getRoom() { return laccForAndroidxRoomRoomLibraryAccessors; }

    }

    public static class AndroidxRoomRoomLibraryAccessors extends SubDependencyFactory {

        public AndroidxRoomRoomLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for common (androidx.room:room-common)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCommon() { return create("androidx.room.room.common"); }

            /**
             * Creates a dependency provider for compiler (androidx.room:room-compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() { return create("androidx.room.room.compiler"); }

            /**
             * Creates a dependency provider for ktx (androidx.room:room-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx.room.room.ktx"); }

            /**
             * Creates a dependency provider for paging (androidx.room:room-paging)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPaging() { return create("androidx.room.room.paging"); }

            /**
             * Creates a dependency provider for runtime (androidx.room:room-runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() { return create("androidx.room.room.runtime"); }

    }

    public static class AndroidxSavedstateLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final AndroidxSavedstateSavedstateLibraryAccessors laccForAndroidxSavedstateSavedstateLibraryAccessors = new AndroidxSavedstateSavedstateLibraryAccessors(owner);

        public AndroidxSavedstateLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for savedstate (androidx.savedstate:savedstate)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.savedstate"); }

        /**
         * Returns the group of libraries at androidx.savedstate.savedstate
         */
        public AndroidxSavedstateSavedstateLibraryAccessors getSavedstate() { return laccForAndroidxSavedstateSavedstateLibraryAccessors; }

    }

    public static class AndroidxSavedstateSavedstateLibraryAccessors extends SubDependencyFactory {

        public AndroidxSavedstateSavedstateLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktx (androidx.savedstate:savedstate-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("androidx.savedstate.savedstate.ktx"); }

    }

    public static class AndroidxSqliteLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final AndroidxSqliteSqliteLibraryAccessors laccForAndroidxSqliteSqliteLibraryAccessors = new AndroidxSqliteSqliteLibraryAccessors(owner);

        public AndroidxSqliteLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for sqlite (androidx.sqlite:sqlite)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.sqlite"); }

        /**
         * Returns the group of libraries at androidx.sqlite.sqlite
         */
        public AndroidxSqliteSqliteLibraryAccessors getSqlite() { return laccForAndroidxSqliteSqliteLibraryAccessors; }

    }

    public static class AndroidxSqliteSqliteLibraryAccessors extends SubDependencyFactory {

        public AndroidxSqliteSqliteLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for framework (androidx.sqlite:sqlite-framework)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getFramework() { return create("androidx.sqlite.sqlite.framework"); }

    }

    public static class AndroidxStartupLibraryAccessors extends SubDependencyFactory {
        private final AndroidxStartupStartupLibraryAccessors laccForAndroidxStartupStartupLibraryAccessors = new AndroidxStartupStartupLibraryAccessors(owner);

        public AndroidxStartupLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.startup.startup
         */
        public AndroidxStartupStartupLibraryAccessors getStartup() { return laccForAndroidxStartupStartupLibraryAccessors; }

    }

    public static class AndroidxStartupStartupLibraryAccessors extends SubDependencyFactory {

        public AndroidxStartupStartupLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for runtime (androidx.startup:startup-runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() { return create("androidx.startup.startup.runtime"); }

    }

    public static class AndroidxTestLibraryAccessors extends SubDependencyFactory {
        private final AndroidxTestEspressoLibraryAccessors laccForAndroidxTestEspressoLibraryAccessors = new AndroidxTestEspressoLibraryAccessors(owner);
        private final AndroidxTestExtLibraryAccessors laccForAndroidxTestExtLibraryAccessors = new AndroidxTestExtLibraryAccessors(owner);

        public AndroidxTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.test.espresso
         */
        public AndroidxTestEspressoLibraryAccessors getEspresso() { return laccForAndroidxTestEspressoLibraryAccessors; }

        /**
         * Returns the group of libraries at androidx.test.ext
         */
        public AndroidxTestExtLibraryAccessors getExt() { return laccForAndroidxTestExtLibraryAccessors; }

    }

    public static class AndroidxTestEspressoLibraryAccessors extends SubDependencyFactory {
        private final AndroidxTestEspressoEspressoLibraryAccessors laccForAndroidxTestEspressoEspressoLibraryAccessors = new AndroidxTestEspressoEspressoLibraryAccessors(owner);

        public AndroidxTestEspressoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.test.espresso.espresso
         */
        public AndroidxTestEspressoEspressoLibraryAccessors getEspresso() { return laccForAndroidxTestEspressoEspressoLibraryAccessors; }

    }

    public static class AndroidxTestEspressoEspressoLibraryAccessors extends SubDependencyFactory {

        public AndroidxTestEspressoEspressoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (androidx.test.espresso:espresso-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("androidx.test.espresso.espresso.core"); }

    }

    public static class AndroidxTestExtLibraryAccessors extends SubDependencyFactory {

        public AndroidxTestExtLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for junit (androidx.test.ext:junit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit() { return create("androidx.test.ext.junit"); }

    }

    public static class AndroidxVectordrawableLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final AndroidxVectordrawableVectordrawableLibraryAccessors laccForAndroidxVectordrawableVectordrawableLibraryAccessors = new AndroidxVectordrawableVectordrawableLibraryAccessors(owner);

        public AndroidxVectordrawableLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for vectordrawable (androidx.vectordrawable:vectordrawable)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("androidx.vectordrawable"); }

        /**
         * Returns the group of libraries at androidx.vectordrawable.vectordrawable
         */
        public AndroidxVectordrawableVectordrawableLibraryAccessors getVectordrawable() { return laccForAndroidxVectordrawableVectordrawableLibraryAccessors; }

    }

    public static class AndroidxVectordrawableVectordrawableLibraryAccessors extends SubDependencyFactory {

        public AndroidxVectordrawableVectordrawableLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for animated (androidx.vectordrawable:vectordrawable-animated)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnimated() { return create("androidx.vectordrawable.vectordrawable.animated"); }

    }

    public static class ComLibraryAccessors extends SubDependencyFactory {
        private final ComAirbnbLibraryAccessors laccForComAirbnbLibraryAccessors = new ComAirbnbLibraryAccessors(owner);
        private final ComGithubLibraryAccessors laccForComGithubLibraryAccessors = new ComGithubLibraryAccessors(owner);
        private final ComGoogleLibraryAccessors laccForComGoogleLibraryAccessors = new ComGoogleLibraryAccessors(owner);
        private final ComJakewhartonLibraryAccessors laccForComJakewhartonLibraryAccessors = new ComJakewhartonLibraryAccessors(owner);
        private final ComSquareupLibraryAccessors laccForComSquareupLibraryAccessors = new ComSquareupLibraryAccessors(owner);

        public ComLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.airbnb
         */
        public ComAirbnbLibraryAccessors getAirbnb() { return laccForComAirbnbLibraryAccessors; }

        /**
         * Returns the group of libraries at com.github
         */
        public ComGithubLibraryAccessors getGithub() { return laccForComGithubLibraryAccessors; }

        /**
         * Returns the group of libraries at com.google
         */
        public ComGoogleLibraryAccessors getGoogle() { return laccForComGoogleLibraryAccessors; }

        /**
         * Returns the group of libraries at com.jakewharton
         */
        public ComJakewhartonLibraryAccessors getJakewharton() { return laccForComJakewhartonLibraryAccessors; }

        /**
         * Returns the group of libraries at com.squareup
         */
        public ComSquareupLibraryAccessors getSquareup() { return laccForComSquareupLibraryAccessors; }

    }

    public static class ComAirbnbLibraryAccessors extends SubDependencyFactory {
        private final ComAirbnbAndroidLibraryAccessors laccForComAirbnbAndroidLibraryAccessors = new ComAirbnbAndroidLibraryAccessors(owner);

        public ComAirbnbLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.airbnb.android
         */
        public ComAirbnbAndroidLibraryAccessors getAndroid() { return laccForComAirbnbAndroidLibraryAccessors; }

    }

    public static class ComAirbnbAndroidLibraryAccessors extends SubDependencyFactory {
        private final ComAirbnbAndroidLottieLibraryAccessors laccForComAirbnbAndroidLottieLibraryAccessors = new ComAirbnbAndroidLottieLibraryAccessors(owner);

        public ComAirbnbAndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.airbnb.android.lottie
         */
        public ComAirbnbAndroidLottieLibraryAccessors getLottie() { return laccForComAirbnbAndroidLottieLibraryAccessors; }

    }

    public static class ComAirbnbAndroidLottieLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ComAirbnbAndroidLottieLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for lottie (com.airbnb.android:lottie)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("com.airbnb.android.lottie"); }

            /**
             * Creates a dependency provider for compose (com.airbnb.android:lottie-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("com.airbnb.android.lottie.compose"); }

    }

    public static class ComGithubLibraryAccessors extends SubDependencyFactory {
        private final ComGithubChuckerteamLibraryAccessors laccForComGithubChuckerteamLibraryAccessors = new ComGithubChuckerteamLibraryAccessors(owner);

        public ComGithubLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.github.chuckerteam
         */
        public ComGithubChuckerteamLibraryAccessors getChuckerteam() { return laccForComGithubChuckerteamLibraryAccessors; }

    }

    public static class ComGithubChuckerteamLibraryAccessors extends SubDependencyFactory {
        private final ComGithubChuckerteamChuckerLibraryAccessors laccForComGithubChuckerteamChuckerLibraryAccessors = new ComGithubChuckerteamChuckerLibraryAccessors(owner);

        public ComGithubChuckerteamLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.github.chuckerteam.chucker
         */
        public ComGithubChuckerteamChuckerLibraryAccessors getChucker() { return laccForComGithubChuckerteamChuckerLibraryAccessors; }

    }

    public static class ComGithubChuckerteamChuckerLibraryAccessors extends SubDependencyFactory {
        private final ComGithubChuckerteamChuckerLibraryLibraryAccessors laccForComGithubChuckerteamChuckerLibraryLibraryAccessors = new ComGithubChuckerteamChuckerLibraryLibraryAccessors(owner);

        public ComGithubChuckerteamChuckerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.github.chuckerteam.chucker.library
         */
        public ComGithubChuckerteamChuckerLibraryLibraryAccessors getLibrary() { return laccForComGithubChuckerteamChuckerLibraryLibraryAccessors; }

    }

    public static class ComGithubChuckerteamChuckerLibraryLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final ComGithubChuckerteamChuckerLibraryNoLibraryAccessors laccForComGithubChuckerteamChuckerLibraryNoLibraryAccessors = new ComGithubChuckerteamChuckerLibraryNoLibraryAccessors(owner);

        public ComGithubChuckerteamChuckerLibraryLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for library (com.github.chuckerteam.chucker:library)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("com.github.chuckerteam.chucker.library"); }

        /**
         * Returns the group of libraries at com.github.chuckerteam.chucker.library.no
         */
        public ComGithubChuckerteamChuckerLibraryNoLibraryAccessors getNo() { return laccForComGithubChuckerteamChuckerLibraryNoLibraryAccessors; }

    }

    public static class ComGithubChuckerteamChuckerLibraryNoLibraryAccessors extends SubDependencyFactory {

        public ComGithubChuckerteamChuckerLibraryNoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for op (com.github.chuckerteam.chucker:library-no-op)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getOp() { return create("com.github.chuckerteam.chucker.library.no.op"); }

    }

    public static class ComGoogleLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleAccompanistLibraryAccessors laccForComGoogleAccompanistLibraryAccessors = new ComGoogleAccompanistLibraryAccessors(owner);
        private final ComGoogleAndroidLibraryAccessors laccForComGoogleAndroidLibraryAccessors = new ComGoogleAndroidLibraryAccessors(owner);
        private final ComGoogleAutoLibraryAccessors laccForComGoogleAutoLibraryAccessors = new ComGoogleAutoLibraryAccessors(owner);
        private final ComGoogleCodeLibraryAccessors laccForComGoogleCodeLibraryAccessors = new ComGoogleCodeLibraryAccessors(owner);
        private final ComGoogleDaggerLibraryAccessors laccForComGoogleDaggerLibraryAccessors = new ComGoogleDaggerLibraryAccessors(owner);
        private final ComGoogleDevtoolsLibraryAccessors laccForComGoogleDevtoolsLibraryAccessors = new ComGoogleDevtoolsLibraryAccessors(owner);
        private final ComGoogleFirebaseLibraryAccessors laccForComGoogleFirebaseLibraryAccessors = new ComGoogleFirebaseLibraryAccessors(owner);
        private final ComGoogleGmsLibraryAccessors laccForComGoogleGmsLibraryAccessors = new ComGoogleGmsLibraryAccessors(owner);
        private final ComGoogleMlkitLibraryAccessors laccForComGoogleMlkitLibraryAccessors = new ComGoogleMlkitLibraryAccessors(owner);
        private final ComGoogleProtobufLibraryAccessors laccForComGoogleProtobufLibraryAccessors = new ComGoogleProtobufLibraryAccessors(owner);

        public ComGoogleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.google.accompanist
         */
        public ComGoogleAccompanistLibraryAccessors getAccompanist() { return laccForComGoogleAccompanistLibraryAccessors; }

        /**
         * Returns the group of libraries at com.google.android
         */
        public ComGoogleAndroidLibraryAccessors getAndroid() { return laccForComGoogleAndroidLibraryAccessors; }

        /**
         * Returns the group of libraries at com.google.auto
         */
        public ComGoogleAutoLibraryAccessors getAuto() { return laccForComGoogleAutoLibraryAccessors; }

        /**
         * Returns the group of libraries at com.google.code
         */
        public ComGoogleCodeLibraryAccessors getCode() { return laccForComGoogleCodeLibraryAccessors; }

        /**
         * Returns the group of libraries at com.google.dagger
         */
        public ComGoogleDaggerLibraryAccessors getDagger() { return laccForComGoogleDaggerLibraryAccessors; }

        /**
         * Returns the group of libraries at com.google.devtools
         */
        public ComGoogleDevtoolsLibraryAccessors getDevtools() { return laccForComGoogleDevtoolsLibraryAccessors; }

        /**
         * Returns the group of libraries at com.google.firebase
         */
        public ComGoogleFirebaseLibraryAccessors getFirebase() { return laccForComGoogleFirebaseLibraryAccessors; }

        /**
         * Returns the group of libraries at com.google.gms
         */
        public ComGoogleGmsLibraryAccessors getGms() { return laccForComGoogleGmsLibraryAccessors; }

        /**
         * Returns the group of libraries at com.google.mlkit
         */
        public ComGoogleMlkitLibraryAccessors getMlkit() { return laccForComGoogleMlkitLibraryAccessors; }

        /**
         * Returns the group of libraries at com.google.protobuf
         */
        public ComGoogleProtobufLibraryAccessors getProtobuf() { return laccForComGoogleProtobufLibraryAccessors; }

    }

    public static class ComGoogleAccompanistLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleAccompanistAccompanistLibraryAccessors laccForComGoogleAccompanistAccompanistLibraryAccessors = new ComGoogleAccompanistAccompanistLibraryAccessors(owner);

        public ComGoogleAccompanistLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.google.accompanist.accompanist
         */
        public ComGoogleAccompanistAccompanistLibraryAccessors getAccompanist() { return laccForComGoogleAccompanistAccompanistLibraryAccessors; }

    }

    public static class ComGoogleAccompanistAccompanistLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleAccompanistAccompanistNavigationLibraryAccessors laccForComGoogleAccompanistAccompanistNavigationLibraryAccessors = new ComGoogleAccompanistAccompanistNavigationLibraryAccessors(owner);
        private final ComGoogleAccompanistAccompanistPagerLibraryAccessors laccForComGoogleAccompanistAccompanistPagerLibraryAccessors = new ComGoogleAccompanistAccompanistPagerLibraryAccessors(owner);

        public ComGoogleAccompanistAccompanistLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for drawablepainter (com.google.accompanist:accompanist-drawablepainter)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDrawablepainter() { return create("com.google.accompanist.accompanist.drawablepainter"); }

            /**
             * Creates a dependency provider for flowlayout (com.google.accompanist:accompanist-flowlayout)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getFlowlayout() { return create("com.google.accompanist.accompanist.flowlayout"); }

            /**
             * Creates a dependency provider for permissions (com.google.accompanist:accompanist-permissions)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPermissions() { return create("com.google.accompanist.accompanist.permissions"); }

            /**
             * Creates a dependency provider for placeholder (com.google.accompanist:accompanist-placeholder)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPlaceholder() { return create("com.google.accompanist.accompanist.placeholder"); }

            /**
             * Creates a dependency provider for swiperefresh (com.google.accompanist:accompanist-swiperefresh)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSwiperefresh() { return create("com.google.accompanist.accompanist.swiperefresh"); }

            /**
             * Creates a dependency provider for systemuicontroller (com.google.accompanist:accompanist-systemuicontroller)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSystemuicontroller() { return create("com.google.accompanist.accompanist.systemuicontroller"); }

        /**
         * Returns the group of libraries at com.google.accompanist.accompanist.navigation
         */
        public ComGoogleAccompanistAccompanistNavigationLibraryAccessors getNavigation() { return laccForComGoogleAccompanistAccompanistNavigationLibraryAccessors; }

        /**
         * Returns the group of libraries at com.google.accompanist.accompanist.pager
         */
        public ComGoogleAccompanistAccompanistPagerLibraryAccessors getPager() { return laccForComGoogleAccompanistAccompanistPagerLibraryAccessors; }

    }

    public static class ComGoogleAccompanistAccompanistNavigationLibraryAccessors extends SubDependencyFactory {

        public ComGoogleAccompanistAccompanistNavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for animation (com.google.accompanist:accompanist-navigation-animation)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnimation() { return create("com.google.accompanist.accompanist.navigation.animation"); }

            /**
             * Creates a dependency provider for material (com.google.accompanist:accompanist-navigation-material)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterial() { return create("com.google.accompanist.accompanist.navigation.material"); }

    }

    public static class ComGoogleAccompanistAccompanistPagerLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ComGoogleAccompanistAccompanistPagerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for pager (com.google.accompanist:accompanist-pager)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("com.google.accompanist.accompanist.pager"); }

            /**
             * Creates a dependency provider for indicators (com.google.accompanist:accompanist-pager-indicators)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getIndicators() { return create("com.google.accompanist.accompanist.pager.indicators"); }

    }

    public static class ComGoogleAndroidLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleAndroidDatatransportLibraryAccessors laccForComGoogleAndroidDatatransportLibraryAccessors = new ComGoogleAndroidDatatransportLibraryAccessors(owner);
        private final ComGoogleAndroidGmsLibraryAccessors laccForComGoogleAndroidGmsLibraryAccessors = new ComGoogleAndroidGmsLibraryAccessors(owner);
        private final ComGoogleAndroidOdmlLibraryAccessors laccForComGoogleAndroidOdmlLibraryAccessors = new ComGoogleAndroidOdmlLibraryAccessors(owner);

        public ComGoogleAndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for material (com.google.android.material:material)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterial() { return create("com.google.android.material"); }

        /**
         * Returns the group of libraries at com.google.android.datatransport
         */
        public ComGoogleAndroidDatatransportLibraryAccessors getDatatransport() { return laccForComGoogleAndroidDatatransportLibraryAccessors; }

        /**
         * Returns the group of libraries at com.google.android.gms
         */
        public ComGoogleAndroidGmsLibraryAccessors getGms() { return laccForComGoogleAndroidGmsLibraryAccessors; }

        /**
         * Returns the group of libraries at com.google.android.odml
         */
        public ComGoogleAndroidOdmlLibraryAccessors getOdml() { return laccForComGoogleAndroidOdmlLibraryAccessors; }

    }

    public static class ComGoogleAndroidDatatransportLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleAndroidDatatransportTransportLibraryAccessors laccForComGoogleAndroidDatatransportTransportLibraryAccessors = new ComGoogleAndroidDatatransportTransportLibraryAccessors(owner);

        public ComGoogleAndroidDatatransportLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.google.android.datatransport.transport
         */
        public ComGoogleAndroidDatatransportTransportLibraryAccessors getTransport() { return laccForComGoogleAndroidDatatransportTransportLibraryAccessors; }

    }

    public static class ComGoogleAndroidDatatransportTransportLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleAndroidDatatransportTransportBackendLibraryAccessors laccForComGoogleAndroidDatatransportTransportBackendLibraryAccessors = new ComGoogleAndroidDatatransportTransportBackendLibraryAccessors(owner);

        public ComGoogleAndroidDatatransportTransportLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (com.google.android.datatransport:transport-api)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApi() { return create("com.google.android.datatransport.transport.api"); }

            /**
             * Creates a dependency provider for runtime (com.google.android.datatransport:transport-runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() { return create("com.google.android.datatransport.transport.runtime"); }

        /**
         * Returns the group of libraries at com.google.android.datatransport.transport.backend
         */
        public ComGoogleAndroidDatatransportTransportBackendLibraryAccessors getBackend() { return laccForComGoogleAndroidDatatransportTransportBackendLibraryAccessors; }

    }

    public static class ComGoogleAndroidDatatransportTransportBackendLibraryAccessors extends SubDependencyFactory {

        public ComGoogleAndroidDatatransportTransportBackendLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for cct (com.google.android.datatransport:transport-backend-cct)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCct() { return create("com.google.android.datatransport.transport.backend.cct"); }

    }

    public static class ComGoogleAndroidGmsLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleAndroidGmsPlayLibraryAccessors laccForComGoogleAndroidGmsPlayLibraryAccessors = new ComGoogleAndroidGmsPlayLibraryAccessors(owner);

        public ComGoogleAndroidGmsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.google.android.gms.play
         */
        public ComGoogleAndroidGmsPlayLibraryAccessors getPlay() { return laccForComGoogleAndroidGmsPlayLibraryAccessors; }

    }

    public static class ComGoogleAndroidGmsPlayLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleAndroidGmsPlayServicesLibraryAccessors laccForComGoogleAndroidGmsPlayServicesLibraryAccessors = new ComGoogleAndroidGmsPlayServicesLibraryAccessors(owner);

        public ComGoogleAndroidGmsPlayLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.google.android.gms.play.services
         */
        public ComGoogleAndroidGmsPlayServicesLibraryAccessors getServices() { return laccForComGoogleAndroidGmsPlayServicesLibraryAccessors; }

    }

    public static class ComGoogleAndroidGmsPlayServicesLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleAndroidGmsPlayServicesAdsLibraryAccessors laccForComGoogleAndroidGmsPlayServicesAdsLibraryAccessors = new ComGoogleAndroidGmsPlayServicesAdsLibraryAccessors(owner);
        private final ComGoogleAndroidGmsPlayServicesMeasurementLibraryAccessors laccForComGoogleAndroidGmsPlayServicesMeasurementLibraryAccessors = new ComGoogleAndroidGmsPlayServicesMeasurementLibraryAccessors(owner);
        private final ComGoogleAndroidGmsPlayServicesMlkitLibraryAccessors laccForComGoogleAndroidGmsPlayServicesMlkitLibraryAccessors = new ComGoogleAndroidGmsPlayServicesMlkitLibraryAccessors(owner);

        public ComGoogleAndroidGmsPlayServicesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for base (com.google.android.gms:play-services-base)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBase() { return create("com.google.android.gms.play.services.base"); }

            /**
             * Creates a dependency provider for basement (com.google.android.gms:play-services-basement)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBasement() { return create("com.google.android.gms.play.services.basement"); }

            /**
             * Creates a dependency provider for stats (com.google.android.gms:play-services-stats)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getStats() { return create("com.google.android.gms.play.services.stats"); }

            /**
             * Creates a dependency provider for tasks (com.google.android.gms:play-services-tasks)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTasks() { return create("com.google.android.gms.play.services.tasks"); }

        /**
         * Returns the group of libraries at com.google.android.gms.play.services.ads
         */
        public ComGoogleAndroidGmsPlayServicesAdsLibraryAccessors getAds() { return laccForComGoogleAndroidGmsPlayServicesAdsLibraryAccessors; }

        /**
         * Returns the group of libraries at com.google.android.gms.play.services.measurement
         */
        public ComGoogleAndroidGmsPlayServicesMeasurementLibraryAccessors getMeasurement() { return laccForComGoogleAndroidGmsPlayServicesMeasurementLibraryAccessors; }

        /**
         * Returns the group of libraries at com.google.android.gms.play.services.mlkit
         */
        public ComGoogleAndroidGmsPlayServicesMlkitLibraryAccessors getMlkit() { return laccForComGoogleAndroidGmsPlayServicesMlkitLibraryAccessors; }

    }

    public static class ComGoogleAndroidGmsPlayServicesAdsLibraryAccessors extends SubDependencyFactory {

        public ComGoogleAndroidGmsPlayServicesAdsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for identifier (com.google.android.gms:play-services-ads-identifier)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getIdentifier() { return create("com.google.android.gms.play.services.ads.identifier"); }

    }

    public static class ComGoogleAndroidGmsPlayServicesMeasurementLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final ComGoogleAndroidGmsPlayServicesMeasurementSdkLibraryAccessors laccForComGoogleAndroidGmsPlayServicesMeasurementSdkLibraryAccessors = new ComGoogleAndroidGmsPlayServicesMeasurementSdkLibraryAccessors(owner);

        public ComGoogleAndroidGmsPlayServicesMeasurementLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for measurement (com.google.android.gms:play-services-measurement)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("com.google.android.gms.play.services.measurement"); }

            /**
             * Creates a dependency provider for api (com.google.android.gms:play-services-measurement-api)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApi() { return create("com.google.android.gms.play.services.measurement.api"); }

            /**
             * Creates a dependency provider for base (com.google.android.gms:play-services-measurement-base)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBase() { return create("com.google.android.gms.play.services.measurement.base"); }

            /**
             * Creates a dependency provider for impl (com.google.android.gms:play-services-measurement-impl)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getImpl() { return create("com.google.android.gms.play.services.measurement.impl"); }

        /**
         * Returns the group of libraries at com.google.android.gms.play.services.measurement.sdk
         */
        public ComGoogleAndroidGmsPlayServicesMeasurementSdkLibraryAccessors getSdk() { return laccForComGoogleAndroidGmsPlayServicesMeasurementSdkLibraryAccessors; }

    }

    public static class ComGoogleAndroidGmsPlayServicesMeasurementSdkLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ComGoogleAndroidGmsPlayServicesMeasurementSdkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for sdk (com.google.android.gms:play-services-measurement-sdk)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("com.google.android.gms.play.services.measurement.sdk"); }

            /**
             * Creates a dependency provider for api (com.google.android.gms:play-services-measurement-sdk-api)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApi() { return create("com.google.android.gms.play.services.measurement.sdk.api"); }

    }

    public static class ComGoogleAndroidGmsPlayServicesMlkitLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleAndroidGmsPlayServicesMlkitTextLibraryAccessors laccForComGoogleAndroidGmsPlayServicesMlkitTextLibraryAccessors = new ComGoogleAndroidGmsPlayServicesMlkitTextLibraryAccessors(owner);

        public ComGoogleAndroidGmsPlayServicesMlkitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.google.android.gms.play.services.mlkit.text
         */
        public ComGoogleAndroidGmsPlayServicesMlkitTextLibraryAccessors getText() { return laccForComGoogleAndroidGmsPlayServicesMlkitTextLibraryAccessors; }

    }

    public static class ComGoogleAndroidGmsPlayServicesMlkitTextLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleAndroidGmsPlayServicesMlkitTextRecognitionLibraryAccessors laccForComGoogleAndroidGmsPlayServicesMlkitTextRecognitionLibraryAccessors = new ComGoogleAndroidGmsPlayServicesMlkitTextRecognitionLibraryAccessors(owner);

        public ComGoogleAndroidGmsPlayServicesMlkitTextLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.google.android.gms.play.services.mlkit.text.recognition
         */
        public ComGoogleAndroidGmsPlayServicesMlkitTextRecognitionLibraryAccessors getRecognition() { return laccForComGoogleAndroidGmsPlayServicesMlkitTextRecognitionLibraryAccessors; }

    }

    public static class ComGoogleAndroidGmsPlayServicesMlkitTextRecognitionLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ComGoogleAndroidGmsPlayServicesMlkitTextRecognitionLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for recognition (com.google.android.gms:play-services-mlkit-text-recognition)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("com.google.android.gms.play.services.mlkit.text.recognition"); }

            /**
             * Creates a dependency provider for common (com.google.android.gms:play-services-mlkit-text-recognition-common)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCommon() { return create("com.google.android.gms.play.services.mlkit.text.recognition.common"); }

    }

    public static class ComGoogleAndroidOdmlLibraryAccessors extends SubDependencyFactory {

        public ComGoogleAndroidOdmlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for image (com.google.android.odml:image)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getImage() { return create("com.google.android.odml.image"); }

    }

    public static class ComGoogleAutoLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleAutoValueLibraryAccessors laccForComGoogleAutoValueLibraryAccessors = new ComGoogleAutoValueLibraryAccessors(owner);

        public ComGoogleAutoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.google.auto.value
         */
        public ComGoogleAutoValueLibraryAccessors getValue() { return laccForComGoogleAutoValueLibraryAccessors; }

    }

    public static class ComGoogleAutoValueLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleAutoValueAutoLibraryAccessors laccForComGoogleAutoValueAutoLibraryAccessors = new ComGoogleAutoValueAutoLibraryAccessors(owner);

        public ComGoogleAutoValueLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.google.auto.value.auto
         */
        public ComGoogleAutoValueAutoLibraryAccessors getAuto() { return laccForComGoogleAutoValueAutoLibraryAccessors; }

    }

    public static class ComGoogleAutoValueAutoLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleAutoValueAutoValueLibraryAccessors laccForComGoogleAutoValueAutoValueLibraryAccessors = new ComGoogleAutoValueAutoValueLibraryAccessors(owner);

        public ComGoogleAutoValueAutoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.google.auto.value.auto.value
         */
        public ComGoogleAutoValueAutoValueLibraryAccessors getValue() { return laccForComGoogleAutoValueAutoValueLibraryAccessors; }

    }

    public static class ComGoogleAutoValueAutoValueLibraryAccessors extends SubDependencyFactory {

        public ComGoogleAutoValueAutoValueLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for annotations (com.google.auto.value:auto-value-annotations)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnnotations() { return create("com.google.auto.value.auto.value.annotations"); }

    }

    public static class ComGoogleCodeLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleCodeFindbugsLibraryAccessors laccForComGoogleCodeFindbugsLibraryAccessors = new ComGoogleCodeFindbugsLibraryAccessors(owner);

        public ComGoogleCodeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for gson (com.google.code.gson:gson)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGson() { return create("com.google.code.gson"); }

        /**
         * Returns the group of libraries at com.google.code.findbugs
         */
        public ComGoogleCodeFindbugsLibraryAccessors getFindbugs() { return laccForComGoogleCodeFindbugsLibraryAccessors; }

    }

    public static class ComGoogleCodeFindbugsLibraryAccessors extends SubDependencyFactory {

        public ComGoogleCodeFindbugsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for jsr305 (com.google.code.findbugs:jsr305)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJsr305() { return create("com.google.code.findbugs.jsr305"); }

    }

    public static class ComGoogleDaggerLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final ComGoogleDaggerDaggerLibraryAccessors laccForComGoogleDaggerDaggerLibraryAccessors = new ComGoogleDaggerDaggerLibraryAccessors(owner);
        private final ComGoogleDaggerHiltLibraryAccessors laccForComGoogleDaggerHiltLibraryAccessors = new ComGoogleDaggerHiltLibraryAccessors(owner);

        public ComGoogleDaggerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for dagger (com.google.dagger:dagger)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("com.google.dagger"); }

        /**
         * Returns the group of libraries at com.google.dagger.dagger
         */
        public ComGoogleDaggerDaggerLibraryAccessors getDagger() { return laccForComGoogleDaggerDaggerLibraryAccessors; }

        /**
         * Returns the group of libraries at com.google.dagger.hilt
         */
        public ComGoogleDaggerHiltLibraryAccessors getHilt() { return laccForComGoogleDaggerHiltLibraryAccessors; }

    }

    public static class ComGoogleDaggerDaggerLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleDaggerDaggerLintLibraryAccessors laccForComGoogleDaggerDaggerLintLibraryAccessors = new ComGoogleDaggerDaggerLintLibraryAccessors(owner);

        public ComGoogleDaggerDaggerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.google.dagger.dagger.lint
         */
        public ComGoogleDaggerDaggerLintLibraryAccessors getLint() { return laccForComGoogleDaggerDaggerLintLibraryAccessors; }

    }

    public static class ComGoogleDaggerDaggerLintLibraryAccessors extends SubDependencyFactory {

        public ComGoogleDaggerDaggerLintLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for aar (com.google.dagger:dagger-lint-aar)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAar() { return create("com.google.dagger.dagger.lint.aar"); }

    }

    public static class ComGoogleDaggerHiltLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleDaggerHiltAndroidLibraryAccessors laccForComGoogleDaggerHiltAndroidLibraryAccessors = new ComGoogleDaggerHiltAndroidLibraryAccessors(owner);

        public ComGoogleDaggerHiltLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (com.google.dagger:hilt-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("com.google.dagger.hilt.core"); }

        /**
         * Returns the group of libraries at com.google.dagger.hilt.android
         */
        public ComGoogleDaggerHiltAndroidLibraryAccessors getAndroid() { return laccForComGoogleDaggerHiltAndroidLibraryAccessors; }

    }

    public static class ComGoogleDaggerHiltAndroidLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final ComGoogleDaggerHiltAndroidGradleLibraryAccessors laccForComGoogleDaggerHiltAndroidGradleLibraryAccessors = new ComGoogleDaggerHiltAndroidGradleLibraryAccessors(owner);

        public ComGoogleDaggerHiltAndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (com.google.dagger:hilt-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("com.google.dagger.hilt.android"); }

            /**
             * Creates a dependency provider for compiler (com.google.dagger:hilt-android-compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() { return create("com.google.dagger.hilt.android.compiler"); }

        /**
         * Returns the group of libraries at com.google.dagger.hilt.android.gradle
         */
        public ComGoogleDaggerHiltAndroidGradleLibraryAccessors getGradle() { return laccForComGoogleDaggerHiltAndroidGradleLibraryAccessors; }

    }

    public static class ComGoogleDaggerHiltAndroidGradleLibraryAccessors extends SubDependencyFactory {

        public ComGoogleDaggerHiltAndroidGradleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for plugin (com.google.dagger:hilt-android-gradle-plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPlugin() { return create("com.google.dagger.hilt.android.gradle.plugin"); }

    }

    public static class ComGoogleDevtoolsLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleDevtoolsKspLibraryAccessors laccForComGoogleDevtoolsKspLibraryAccessors = new ComGoogleDevtoolsKspLibraryAccessors(owner);

        public ComGoogleDevtoolsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.google.devtools.ksp
         */
        public ComGoogleDevtoolsKspLibraryAccessors getKsp() { return laccForComGoogleDevtoolsKspLibraryAccessors; }

    }

    public static class ComGoogleDevtoolsKspLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleDevtoolsKspSymbolLibraryAccessors laccForComGoogleDevtoolsKspSymbolLibraryAccessors = new ComGoogleDevtoolsKspSymbolLibraryAccessors(owner);

        public ComGoogleDevtoolsKspLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.google.devtools.ksp.symbol
         */
        public ComGoogleDevtoolsKspSymbolLibraryAccessors getSymbol() { return laccForComGoogleDevtoolsKspSymbolLibraryAccessors; }

    }

    public static class ComGoogleDevtoolsKspSymbolLibraryAccessors extends SubDependencyFactory {

        public ComGoogleDevtoolsKspSymbolLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for processing (com.google.devtools.ksp:symbol-processing)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getProcessing() { return create("com.google.devtools.ksp.symbol.processing"); }

    }

    public static class ComGoogleFirebaseLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleFirebaseFirebaseLibraryAccessors laccForComGoogleFirebaseFirebaseLibraryAccessors = new ComGoogleFirebaseFirebaseLibraryAccessors(owner);
        private final ComGoogleFirebasePerfLibraryAccessors laccForComGoogleFirebasePerfLibraryAccessors = new ComGoogleFirebasePerfLibraryAccessors(owner);
        private final ComGoogleFirebaseProtoliteLibraryAccessors laccForComGoogleFirebaseProtoliteLibraryAccessors = new ComGoogleFirebaseProtoliteLibraryAccessors(owner);

        public ComGoogleFirebaseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.google.firebase.firebase
         */
        public ComGoogleFirebaseFirebaseLibraryAccessors getFirebase() { return laccForComGoogleFirebaseFirebaseLibraryAccessors; }

        /**
         * Returns the group of libraries at com.google.firebase.perf
         */
        public ComGoogleFirebasePerfLibraryAccessors getPerf() { return laccForComGoogleFirebasePerfLibraryAccessors; }

        /**
         * Returns the group of libraries at com.google.firebase.protolite
         */
        public ComGoogleFirebaseProtoliteLibraryAccessors getProtolite() { return laccForComGoogleFirebaseProtoliteLibraryAccessors; }

    }

    public static class ComGoogleFirebaseFirebaseLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleFirebaseFirebaseAnalyticsLibraryAccessors laccForComGoogleFirebaseFirebaseAnalyticsLibraryAccessors = new ComGoogleFirebaseFirebaseAnalyticsLibraryAccessors(owner);
        private final ComGoogleFirebaseFirebaseCommonLibraryAccessors laccForComGoogleFirebaseFirebaseCommonLibraryAccessors = new ComGoogleFirebaseFirebaseCommonLibraryAccessors(owner);
        private final ComGoogleFirebaseFirebaseCrashlyticsLibraryAccessors laccForComGoogleFirebaseFirebaseCrashlyticsLibraryAccessors = new ComGoogleFirebaseFirebaseCrashlyticsLibraryAccessors(owner);
        private final ComGoogleFirebaseFirebaseEncodersLibraryAccessors laccForComGoogleFirebaseFirebaseEncodersLibraryAccessors = new ComGoogleFirebaseFirebaseEncodersLibraryAccessors(owner);
        private final ComGoogleFirebaseFirebaseInstallationsLibraryAccessors laccForComGoogleFirebaseFirebaseInstallationsLibraryAccessors = new ComGoogleFirebaseFirebaseInstallationsLibraryAccessors(owner);
        private final ComGoogleFirebaseFirebaseMeasurementLibraryAccessors laccForComGoogleFirebaseFirebaseMeasurementLibraryAccessors = new ComGoogleFirebaseFirebaseMeasurementLibraryAccessors(owner);
        private final ComGoogleFirebaseFirebasePerfLibraryAccessors laccForComGoogleFirebaseFirebasePerfLibraryAccessors = new ComGoogleFirebaseFirebasePerfLibraryAccessors(owner);

        public ComGoogleFirebaseFirebaseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for abt (com.google.firebase:firebase-abt)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAbt() { return create("com.google.firebase.firebase.abt"); }

            /**
             * Creates a dependency provider for annotations (com.google.firebase:firebase-annotations)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnnotations() { return create("com.google.firebase.firebase.annotations"); }

            /**
             * Creates a dependency provider for bom (com.google.firebase:firebase-bom)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBom() { return create("com.google.firebase.firebase.bom"); }

            /**
             * Creates a dependency provider for components (com.google.firebase:firebase-components)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getComponents() { return create("com.google.firebase.firebase.components"); }

            /**
             * Creates a dependency provider for config (com.google.firebase:firebase-config)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getConfig() { return create("com.google.firebase.firebase.config"); }

            /**
             * Creates a dependency provider for datatransport (com.google.firebase:firebase-datatransport)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDatatransport() { return create("com.google.firebase.firebase.datatransport"); }

        /**
         * Returns the group of libraries at com.google.firebase.firebase.analytics
         */
        public ComGoogleFirebaseFirebaseAnalyticsLibraryAccessors getAnalytics() { return laccForComGoogleFirebaseFirebaseAnalyticsLibraryAccessors; }

        /**
         * Returns the group of libraries at com.google.firebase.firebase.common
         */
        public ComGoogleFirebaseFirebaseCommonLibraryAccessors getCommon() { return laccForComGoogleFirebaseFirebaseCommonLibraryAccessors; }

        /**
         * Returns the group of libraries at com.google.firebase.firebase.crashlytics
         */
        public ComGoogleFirebaseFirebaseCrashlyticsLibraryAccessors getCrashlytics() { return laccForComGoogleFirebaseFirebaseCrashlyticsLibraryAccessors; }

        /**
         * Returns the group of libraries at com.google.firebase.firebase.encoders
         */
        public ComGoogleFirebaseFirebaseEncodersLibraryAccessors getEncoders() { return laccForComGoogleFirebaseFirebaseEncodersLibraryAccessors; }

        /**
         * Returns the group of libraries at com.google.firebase.firebase.installations
         */
        public ComGoogleFirebaseFirebaseInstallationsLibraryAccessors getInstallations() { return laccForComGoogleFirebaseFirebaseInstallationsLibraryAccessors; }

        /**
         * Returns the group of libraries at com.google.firebase.firebase.measurement
         */
        public ComGoogleFirebaseFirebaseMeasurementLibraryAccessors getMeasurement() { return laccForComGoogleFirebaseFirebaseMeasurementLibraryAccessors; }

        /**
         * Returns the group of libraries at com.google.firebase.firebase.perf
         */
        public ComGoogleFirebaseFirebasePerfLibraryAccessors getPerf() { return laccForComGoogleFirebaseFirebasePerfLibraryAccessors; }

    }

    public static class ComGoogleFirebaseFirebaseAnalyticsLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ComGoogleFirebaseFirebaseAnalyticsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for analytics (com.google.firebase:firebase-analytics)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("com.google.firebase.firebase.analytics"); }

            /**
             * Creates a dependency provider for ktx (com.google.firebase:firebase-analytics-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("com.google.firebase.firebase.analytics.ktx"); }

    }

    public static class ComGoogleFirebaseFirebaseCommonLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ComGoogleFirebaseFirebaseCommonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for common (com.google.firebase:firebase-common)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("com.google.firebase.firebase.common"); }

            /**
             * Creates a dependency provider for ktx (com.google.firebase:firebase-common-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("com.google.firebase.firebase.common.ktx"); }

    }

    public static class ComGoogleFirebaseFirebaseCrashlyticsLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ComGoogleFirebaseFirebaseCrashlyticsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for crashlytics (com.google.firebase:firebase-crashlytics)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("com.google.firebase.firebase.crashlytics"); }

            /**
             * Creates a dependency provider for gradle (com.google.firebase:firebase-crashlytics-gradle)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGradle() { return create("com.google.firebase.firebase.crashlytics.gradle"); }

            /**
             * Creates a dependency provider for ktx (com.google.firebase:firebase-crashlytics-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("com.google.firebase.firebase.crashlytics.ktx"); }

    }

    public static class ComGoogleFirebaseFirebaseEncodersLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ComGoogleFirebaseFirebaseEncodersLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for encoders (com.google.firebase:firebase-encoders)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("com.google.firebase.firebase.encoders"); }

            /**
             * Creates a dependency provider for json (com.google.firebase:firebase-encoders-json)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJson() { return create("com.google.firebase.firebase.encoders.json"); }

            /**
             * Creates a dependency provider for proto (com.google.firebase:firebase-encoders-proto)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getProto() { return create("com.google.firebase.firebase.encoders.proto"); }

    }

    public static class ComGoogleFirebaseFirebaseInstallationsLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ComGoogleFirebaseFirebaseInstallationsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for installations (com.google.firebase:firebase-installations)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("com.google.firebase.firebase.installations"); }

            /**
             * Creates a dependency provider for interop (com.google.firebase:firebase-installations-interop)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getInterop() { return create("com.google.firebase.firebase.installations.interop"); }

    }

    public static class ComGoogleFirebaseFirebaseMeasurementLibraryAccessors extends SubDependencyFactory {

        public ComGoogleFirebaseFirebaseMeasurementLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for connector (com.google.firebase:firebase-measurement-connector)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getConnector() { return create("com.google.firebase.firebase.measurement.connector"); }

    }

    public static class ComGoogleFirebaseFirebasePerfLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ComGoogleFirebaseFirebasePerfLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for perf (com.google.firebase:firebase-perf)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("com.google.firebase.firebase.perf"); }

            /**
             * Creates a dependency provider for ktx (com.google.firebase:firebase-perf-ktx)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("com.google.firebase.firebase.perf.ktx"); }

    }

    public static class ComGoogleFirebasePerfLibraryAccessors extends SubDependencyFactory {

        public ComGoogleFirebasePerfLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for plugin (com.google.firebase:perf-plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPlugin() { return create("com.google.firebase.perf.plugin"); }

    }

    public static class ComGoogleFirebaseProtoliteLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleFirebaseProtoliteWellLibraryAccessors laccForComGoogleFirebaseProtoliteWellLibraryAccessors = new ComGoogleFirebaseProtoliteWellLibraryAccessors(owner);

        public ComGoogleFirebaseProtoliteLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.google.firebase.protolite.well
         */
        public ComGoogleFirebaseProtoliteWellLibraryAccessors getWell() { return laccForComGoogleFirebaseProtoliteWellLibraryAccessors; }

    }

    public static class ComGoogleFirebaseProtoliteWellLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleFirebaseProtoliteWellKnownLibraryAccessors laccForComGoogleFirebaseProtoliteWellKnownLibraryAccessors = new ComGoogleFirebaseProtoliteWellKnownLibraryAccessors(owner);

        public ComGoogleFirebaseProtoliteWellLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.google.firebase.protolite.well.known
         */
        public ComGoogleFirebaseProtoliteWellKnownLibraryAccessors getKnown() { return laccForComGoogleFirebaseProtoliteWellKnownLibraryAccessors; }

    }

    public static class ComGoogleFirebaseProtoliteWellKnownLibraryAccessors extends SubDependencyFactory {

        public ComGoogleFirebaseProtoliteWellKnownLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for types (com.google.firebase:protolite-well-known-types)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTypes() { return create("com.google.firebase.protolite.well.known.types"); }

    }

    public static class ComGoogleGmsLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleGmsGoogleLibraryAccessors laccForComGoogleGmsGoogleLibraryAccessors = new ComGoogleGmsGoogleLibraryAccessors(owner);

        public ComGoogleGmsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.google.gms.google
         */
        public ComGoogleGmsGoogleLibraryAccessors getGoogle() { return laccForComGoogleGmsGoogleLibraryAccessors; }

    }

    public static class ComGoogleGmsGoogleLibraryAccessors extends SubDependencyFactory {

        public ComGoogleGmsGoogleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for services (com.google.gms:google-services)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getServices() { return create("com.google.gms.google.services"); }

    }

    public static class ComGoogleMlkitLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleMlkitTextLibraryAccessors laccForComGoogleMlkitTextLibraryAccessors = new ComGoogleMlkitTextLibraryAccessors(owner);
        private final ComGoogleMlkitVisionLibraryAccessors laccForComGoogleMlkitVisionLibraryAccessors = new ComGoogleMlkitVisionLibraryAccessors(owner);

        public ComGoogleMlkitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for common (com.google.mlkit:common)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCommon() { return create("com.google.mlkit.common"); }

        /**
         * Returns the group of libraries at com.google.mlkit.text
         */
        public ComGoogleMlkitTextLibraryAccessors getText() { return laccForComGoogleMlkitTextLibraryAccessors; }

        /**
         * Returns the group of libraries at com.google.mlkit.vision
         */
        public ComGoogleMlkitVisionLibraryAccessors getVision() { return laccForComGoogleMlkitVisionLibraryAccessors; }

    }

    public static class ComGoogleMlkitTextLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleMlkitTextRecognitionLibraryAccessors laccForComGoogleMlkitTextRecognitionLibraryAccessors = new ComGoogleMlkitTextRecognitionLibraryAccessors(owner);

        public ComGoogleMlkitTextLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.google.mlkit.text.recognition
         */
        public ComGoogleMlkitTextRecognitionLibraryAccessors getRecognition() { return laccForComGoogleMlkitTextRecognitionLibraryAccessors; }

    }

    public static class ComGoogleMlkitTextRecognitionLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final ComGoogleMlkitTextRecognitionBundledLibraryAccessors laccForComGoogleMlkitTextRecognitionBundledLibraryAccessors = new ComGoogleMlkitTextRecognitionBundledLibraryAccessors(owner);

        public ComGoogleMlkitTextRecognitionLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for recognition (com.google.mlkit:text-recognition)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("com.google.mlkit.text.recognition"); }

        /**
         * Returns the group of libraries at com.google.mlkit.text.recognition.bundled
         */
        public ComGoogleMlkitTextRecognitionBundledLibraryAccessors getBundled() { return laccForComGoogleMlkitTextRecognitionBundledLibraryAccessors; }

    }

    public static class ComGoogleMlkitTextRecognitionBundledLibraryAccessors extends SubDependencyFactory {

        public ComGoogleMlkitTextRecognitionBundledLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for common (com.google.mlkit:text-recognition-bundled-common)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCommon() { return create("com.google.mlkit.text.recognition.bundled.common"); }

    }

    public static class ComGoogleMlkitVisionLibraryAccessors extends SubDependencyFactory {

        public ComGoogleMlkitVisionLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for common (com.google.mlkit:vision-common)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCommon() { return create("com.google.mlkit.vision.common"); }

            /**
             * Creates a dependency provider for interfaces (com.google.mlkit:vision-interfaces)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getInterfaces() { return create("com.google.mlkit.vision.interfaces"); }

    }

    public static class ComGoogleProtobufLibraryAccessors extends SubDependencyFactory {
        private final ComGoogleProtobufProtobufLibraryAccessors laccForComGoogleProtobufProtobufLibraryAccessors = new ComGoogleProtobufProtobufLibraryAccessors(owner);

        public ComGoogleProtobufLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.google.protobuf.protobuf
         */
        public ComGoogleProtobufProtobufLibraryAccessors getProtobuf() { return laccForComGoogleProtobufProtobufLibraryAccessors; }

    }

    public static class ComGoogleProtobufProtobufLibraryAccessors extends SubDependencyFactory {

        public ComGoogleProtobufProtobufLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for javalite (com.google.protobuf:protobuf-javalite)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJavalite() { return create("com.google.protobuf.protobuf.javalite"); }

    }

    public static class ComJakewhartonLibraryAccessors extends SubDependencyFactory {

        public ComJakewhartonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for timber (com.jakewharton.timber:timber)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTimber() { return create("com.jakewharton.timber"); }

    }

    public static class ComSquareupLibraryAccessors extends SubDependencyFactory {
        private final ComSquareupMoshiLibraryAccessors laccForComSquareupMoshiLibraryAccessors = new ComSquareupMoshiLibraryAccessors(owner);
        private final ComSquareupOkhttp3LibraryAccessors laccForComSquareupOkhttp3LibraryAccessors = new ComSquareupOkhttp3LibraryAccessors(owner);
        private final ComSquareupOkioLibraryAccessors laccForComSquareupOkioLibraryAccessors = new ComSquareupOkioLibraryAccessors(owner);
        private final ComSquareupRetrofit2LibraryAccessors laccForComSquareupRetrofit2LibraryAccessors = new ComSquareupRetrofit2LibraryAccessors(owner);

        public ComSquareupLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.squareup.moshi
         */
        public ComSquareupMoshiLibraryAccessors getMoshi() { return laccForComSquareupMoshiLibraryAccessors; }

        /**
         * Returns the group of libraries at com.squareup.okhttp3
         */
        public ComSquareupOkhttp3LibraryAccessors getOkhttp3() { return laccForComSquareupOkhttp3LibraryAccessors; }

        /**
         * Returns the group of libraries at com.squareup.okio
         */
        public ComSquareupOkioLibraryAccessors getOkio() { return laccForComSquareupOkioLibraryAccessors; }

        /**
         * Returns the group of libraries at com.squareup.retrofit2
         */
        public ComSquareupRetrofit2LibraryAccessors getRetrofit2() { return laccForComSquareupRetrofit2LibraryAccessors; }

    }

    public static class ComSquareupMoshiLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final ComSquareupMoshiMoshiLibraryAccessors laccForComSquareupMoshiMoshiLibraryAccessors = new ComSquareupMoshiMoshiLibraryAccessors(owner);

        public ComSquareupMoshiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for moshi (com.squareup.moshi:moshi)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("com.squareup.moshi"); }

        /**
         * Returns the group of libraries at com.squareup.moshi.moshi
         */
        public ComSquareupMoshiMoshiLibraryAccessors getMoshi() { return laccForComSquareupMoshiMoshiLibraryAccessors; }

    }

    public static class ComSquareupMoshiMoshiLibraryAccessors extends SubDependencyFactory {
        private final ComSquareupMoshiMoshiKotlinLibraryAccessors laccForComSquareupMoshiMoshiKotlinLibraryAccessors = new ComSquareupMoshiMoshiKotlinLibraryAccessors(owner);

        public ComSquareupMoshiMoshiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.squareup.moshi.moshi.kotlin
         */
        public ComSquareupMoshiMoshiKotlinLibraryAccessors getKotlin() { return laccForComSquareupMoshiMoshiKotlinLibraryAccessors; }

    }

    public static class ComSquareupMoshiMoshiKotlinLibraryAccessors extends SubDependencyFactory {

        public ComSquareupMoshiMoshiKotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for codegen (com.squareup.moshi:moshi-kotlin-codegen)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCodegen() { return create("com.squareup.moshi.moshi.kotlin.codegen"); }

    }

    public static class ComSquareupOkhttp3LibraryAccessors extends SubDependencyFactory {
        private final ComSquareupOkhttp3LoggingLibraryAccessors laccForComSquareupOkhttp3LoggingLibraryAccessors = new ComSquareupOkhttp3LoggingLibraryAccessors(owner);
        private final ComSquareupOkhttp3OkhttpLibraryAccessors laccForComSquareupOkhttp3OkhttpLibraryAccessors = new ComSquareupOkhttp3OkhttpLibraryAccessors(owner);

        public ComSquareupOkhttp3LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at com.squareup.okhttp3.logging
         */
        public ComSquareupOkhttp3LoggingLibraryAccessors getLogging() { return laccForComSquareupOkhttp3LoggingLibraryAccessors; }

        /**
         * Returns the group of libraries at com.squareup.okhttp3.okhttp
         */
        public ComSquareupOkhttp3OkhttpLibraryAccessors getOkhttp() { return laccForComSquareupOkhttp3OkhttpLibraryAccessors; }

    }

    public static class ComSquareupOkhttp3LoggingLibraryAccessors extends SubDependencyFactory {

        public ComSquareupOkhttp3LoggingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for interceptor (com.squareup.okhttp3:logging-interceptor)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getInterceptor() { return create("com.squareup.okhttp3.logging.interceptor"); }

    }

    public static class ComSquareupOkhttp3OkhttpLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ComSquareupOkhttp3OkhttpLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for okhttp (com.squareup.okhttp3:okhttp)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("com.squareup.okhttp3.okhttp"); }

            /**
             * Creates a dependency provider for bom (com.squareup.okhttp3:okhttp-bom)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBom() { return create("com.squareup.okhttp3.okhttp.bom"); }

            /**
             * Creates a dependency provider for jvm (com.squareup.okhttp3:okhttp-jvm)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJvm() { return create("com.squareup.okhttp3.okhttp.jvm"); }

    }

    public static class ComSquareupOkioLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final ComSquareupOkioOkioLibraryAccessors laccForComSquareupOkioOkioLibraryAccessors = new ComSquareupOkioOkioLibraryAccessors(owner);

        public ComSquareupOkioLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for okio (com.squareup.okio:okio)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("com.squareup.okio"); }

        /**
         * Returns the group of libraries at com.squareup.okio.okio
         */
        public ComSquareupOkioOkioLibraryAccessors getOkio() { return laccForComSquareupOkioOkioLibraryAccessors; }

    }

    public static class ComSquareupOkioOkioLibraryAccessors extends SubDependencyFactory {

        public ComSquareupOkioOkioLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for jvm (com.squareup.okio:okio-jvm)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJvm() { return create("com.squareup.okio.okio.jvm"); }

    }

    public static class ComSquareupRetrofit2LibraryAccessors extends SubDependencyFactory {
        private final ComSquareupRetrofit2ConverterLibraryAccessors laccForComSquareupRetrofit2ConverterLibraryAccessors = new ComSquareupRetrofit2ConverterLibraryAccessors(owner);

        public ComSquareupRetrofit2LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for retrofit (com.squareup.retrofit2:retrofit)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRetrofit() { return create("com.squareup.retrofit2.retrofit"); }

        /**
         * Returns the group of libraries at com.squareup.retrofit2.converter
         */
        public ComSquareupRetrofit2ConverterLibraryAccessors getConverter() { return laccForComSquareupRetrofit2ConverterLibraryAccessors; }

    }

    public static class ComSquareupRetrofit2ConverterLibraryAccessors extends SubDependencyFactory {

        public ComSquareupRetrofit2ConverterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for moshi (com.squareup.retrofit2:converter-moshi)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMoshi() { return create("com.squareup.retrofit2.converter.moshi"); }

    }

    public static class DevLibraryAccessors extends SubDependencyFactory {
        private final DevChrisbanesLibraryAccessors laccForDevChrisbanesLibraryAccessors = new DevChrisbanesLibraryAccessors(owner);

        public DevLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at dev.chrisbanes
         */
        public DevChrisbanesLibraryAccessors getChrisbanes() { return laccForDevChrisbanesLibraryAccessors; }

    }

    public static class DevChrisbanesLibraryAccessors extends SubDependencyFactory {

        public DevChrisbanesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for snapper (dev.chrisbanes.snapper:snapper)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSnapper() { return create("dev.chrisbanes.snapper"); }

    }

    public static class IoLibraryAccessors extends SubDependencyFactory {
        private final IoCoilLibraryAccessors laccForIoCoilLibraryAccessors = new IoCoilLibraryAccessors(owner);
        private final IoGithubLibraryAccessors laccForIoGithubLibraryAccessors = new IoGithubLibraryAccessors(owner);

        public IoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at io.coil
         */
        public IoCoilLibraryAccessors getCoil() { return laccForIoCoilLibraryAccessors; }

        /**
         * Returns the group of libraries at io.github
         */
        public IoGithubLibraryAccessors getGithub() { return laccForIoGithubLibraryAccessors; }

    }

    public static class IoCoilLibraryAccessors extends SubDependencyFactory {
        private final IoCoilKtLibraryAccessors laccForIoCoilKtLibraryAccessors = new IoCoilKtLibraryAccessors(owner);

        public IoCoilLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at io.coil.kt
         */
        public IoCoilKtLibraryAccessors getKt() { return laccForIoCoilKtLibraryAccessors; }

    }

    public static class IoCoilKtLibraryAccessors extends SubDependencyFactory {
        private final IoCoilKtCoilLibraryAccessors laccForIoCoilKtCoilLibraryAccessors = new IoCoilKtCoilLibraryAccessors(owner);

        public IoCoilKtLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at io.coil.kt.coil
         */
        public IoCoilKtCoilLibraryAccessors getCoil() { return laccForIoCoilKtCoilLibraryAccessors; }

    }

    public static class IoCoilKtCoilLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final IoCoilKtCoilComposeLibraryAccessors laccForIoCoilKtCoilComposeLibraryAccessors = new IoCoilKtCoilComposeLibraryAccessors(owner);

        public IoCoilKtCoilLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for coil (io.coil-kt:coil)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("io.coil.kt.coil"); }

            /**
             * Creates a dependency provider for base (io.coil-kt:coil-base)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBase() { return create("io.coil.kt.coil.base"); }

        /**
         * Returns the group of libraries at io.coil.kt.coil.compose
         */
        public IoCoilKtCoilComposeLibraryAccessors getCompose() { return laccForIoCoilKtCoilComposeLibraryAccessors; }

    }

    public static class IoCoilKtCoilComposeLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public IoCoilKtCoilComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (io.coil-kt:coil-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("io.coil.kt.coil.compose"); }

            /**
             * Creates a dependency provider for base (io.coil-kt:coil-compose-base)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBase() { return create("io.coil.kt.coil.compose.base"); }

    }

    public static class IoGithubLibraryAccessors extends SubDependencyFactory {
        private final IoGithubAakiraLibraryAccessors laccForIoGithubAakiraLibraryAccessors = new IoGithubAakiraLibraryAccessors(owner);
        private final IoGithubRaamcostaLibraryAccessors laccForIoGithubRaamcostaLibraryAccessors = new IoGithubRaamcostaLibraryAccessors(owner);

        public IoGithubLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at io.github.aakira
         */
        public IoGithubAakiraLibraryAccessors getAakira() { return laccForIoGithubAakiraLibraryAccessors; }

        /**
         * Returns the group of libraries at io.github.raamcosta
         */
        public IoGithubRaamcostaLibraryAccessors getRaamcosta() { return laccForIoGithubRaamcostaLibraryAccessors; }

    }

    public static class IoGithubAakiraLibraryAccessors extends SubDependencyFactory {
        private final IoGithubAakiraNapierLibraryAccessors laccForIoGithubAakiraNapierLibraryAccessors = new IoGithubAakiraNapierLibraryAccessors(owner);

        public IoGithubAakiraLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at io.github.aakira.napier
         */
        public IoGithubAakiraNapierLibraryAccessors getNapier() { return laccForIoGithubAakiraNapierLibraryAccessors; }

    }

    public static class IoGithubAakiraNapierLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final IoGithubAakiraNapierAndroidLibraryAccessors laccForIoGithubAakiraNapierAndroidLibraryAccessors = new IoGithubAakiraNapierAndroidLibraryAccessors(owner);

        public IoGithubAakiraNapierLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for napier (io.github.aakira:napier)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("io.github.aakira.napier"); }

        /**
         * Returns the group of libraries at io.github.aakira.napier.android
         */
        public IoGithubAakiraNapierAndroidLibraryAccessors getAndroid() { return laccForIoGithubAakiraNapierAndroidLibraryAccessors; }

    }

    public static class IoGithubAakiraNapierAndroidLibraryAccessors extends SubDependencyFactory {

        public IoGithubAakiraNapierAndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for debug (io.github.aakira:napier-android-debug)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDebug() { return create("io.github.aakira.napier.android.debug"); }

    }

    public static class IoGithubRaamcostaLibraryAccessors extends SubDependencyFactory {
        private final IoGithubRaamcostaComposeLibraryAccessors laccForIoGithubRaamcostaComposeLibraryAccessors = new IoGithubRaamcostaComposeLibraryAccessors(owner);

        public IoGithubRaamcostaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at io.github.raamcosta.compose
         */
        public IoGithubRaamcostaComposeLibraryAccessors getCompose() { return laccForIoGithubRaamcostaComposeLibraryAccessors; }

    }

    public static class IoGithubRaamcostaComposeLibraryAccessors extends SubDependencyFactory {
        private final IoGithubRaamcostaComposeDestinationsLibraryAccessors laccForIoGithubRaamcostaComposeDestinationsLibraryAccessors = new IoGithubRaamcostaComposeDestinationsLibraryAccessors(owner);

        public IoGithubRaamcostaComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at io.github.raamcosta.compose.destinations
         */
        public IoGithubRaamcostaComposeDestinationsLibraryAccessors getDestinations() { return laccForIoGithubRaamcostaComposeDestinationsLibraryAccessors; }

    }

    public static class IoGithubRaamcostaComposeDestinationsLibraryAccessors extends SubDependencyFactory {
        private final IoGithubRaamcostaComposeDestinationsAnimationsLibraryAccessors laccForIoGithubRaamcostaComposeDestinationsAnimationsLibraryAccessors = new IoGithubRaamcostaComposeDestinationsAnimationsLibraryAccessors(owner);

        public IoGithubRaamcostaComposeDestinationsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (io.github.raamcosta.compose-destinations:core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("io.github.raamcosta.compose.destinations.core"); }

            /**
             * Creates a dependency provider for ksp (io.github.raamcosta.compose-destinations:ksp)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKsp() { return create("io.github.raamcosta.compose.destinations.ksp"); }

        /**
         * Returns the group of libraries at io.github.raamcosta.compose.destinations.animations
         */
        public IoGithubRaamcostaComposeDestinationsAnimationsLibraryAccessors getAnimations() { return laccForIoGithubRaamcostaComposeDestinationsAnimationsLibraryAccessors; }

    }

    public static class IoGithubRaamcostaComposeDestinationsAnimationsLibraryAccessors extends SubDependencyFactory {

        public IoGithubRaamcostaComposeDestinationsAnimationsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (io.github.raamcosta.compose-destinations:animations-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("io.github.raamcosta.compose.destinations.animations.core"); }

    }

    public static class JavaxLibraryAccessors extends SubDependencyFactory {
        private final JavaxInjectLibraryAccessors laccForJavaxInjectLibraryAccessors = new JavaxInjectLibraryAccessors(owner);

        public JavaxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at javax.inject
         */
        public JavaxInjectLibraryAccessors getInject() { return laccForJavaxInjectLibraryAccessors; }

    }

    public static class JavaxInjectLibraryAccessors extends SubDependencyFactory {
        private final JavaxInjectJavaxLibraryAccessors laccForJavaxInjectJavaxLibraryAccessors = new JavaxInjectJavaxLibraryAccessors(owner);

        public JavaxInjectLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at javax.inject.javax
         */
        public JavaxInjectJavaxLibraryAccessors getJavax() { return laccForJavaxInjectJavaxLibraryAccessors; }

    }

    public static class JavaxInjectJavaxLibraryAccessors extends SubDependencyFactory {

        public JavaxInjectJavaxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for inject (javax.inject:javax.inject)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getInject() { return create("javax.inject.javax.inject"); }

    }

    public static class OrgLibraryAccessors extends SubDependencyFactory {
        private final OrgApacheLibraryAccessors laccForOrgApacheLibraryAccessors = new OrgApacheLibraryAccessors(owner);
        private final OrgJacocoLibraryAccessors laccForOrgJacocoLibraryAccessors = new OrgJacocoLibraryAccessors(owner);
        private final OrgJetbrainsLibraryAccessors laccForOrgJetbrainsLibraryAccessors = new OrgJetbrainsLibraryAccessors(owner);

        public OrgLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.apache
         */
        public OrgApacheLibraryAccessors getApache() { return laccForOrgApacheLibraryAccessors; }

        /**
         * Returns the group of libraries at org.jacoco
         */
        public OrgJacocoLibraryAccessors getJacoco() { return laccForOrgJacocoLibraryAccessors; }

        /**
         * Returns the group of libraries at org.jetbrains
         */
        public OrgJetbrainsLibraryAccessors getJetbrains() { return laccForOrgJetbrainsLibraryAccessors; }

    }

    public static class OrgApacheLibraryAccessors extends SubDependencyFactory {
        private final OrgApacheLoggingLibraryAccessors laccForOrgApacheLoggingLibraryAccessors = new OrgApacheLoggingLibraryAccessors(owner);

        public OrgApacheLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.apache.logging
         */
        public OrgApacheLoggingLibraryAccessors getLogging() { return laccForOrgApacheLoggingLibraryAccessors; }

    }

    public static class OrgApacheLoggingLibraryAccessors extends SubDependencyFactory {
        private final OrgApacheLoggingLog4jLibraryAccessors laccForOrgApacheLoggingLog4jLibraryAccessors = new OrgApacheLoggingLog4jLibraryAccessors(owner);

        public OrgApacheLoggingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.apache.logging.log4j
         */
        public OrgApacheLoggingLog4jLibraryAccessors getLog4j() { return laccForOrgApacheLoggingLog4jLibraryAccessors; }

    }

    public static class OrgApacheLoggingLog4jLibraryAccessors extends SubDependencyFactory {
        private final OrgApacheLoggingLog4jLog4jLibraryAccessors laccForOrgApacheLoggingLog4jLog4jLibraryAccessors = new OrgApacheLoggingLog4jLog4jLibraryAccessors(owner);

        public OrgApacheLoggingLog4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.apache.logging.log4j.log4j
         */
        public OrgApacheLoggingLog4jLog4jLibraryAccessors getLog4j() { return laccForOrgApacheLoggingLog4jLog4jLibraryAccessors; }

    }

    public static class OrgApacheLoggingLog4jLog4jLibraryAccessors extends SubDependencyFactory {

        public OrgApacheLoggingLog4jLog4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.apache.logging.log4j:log4j-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("org.apache.logging.log4j.log4j.core"); }

    }

    public static class OrgJacocoLibraryAccessors extends SubDependencyFactory {
        private final OrgJacocoOrgLibraryAccessors laccForOrgJacocoOrgLibraryAccessors = new OrgJacocoOrgLibraryAccessors(owner);

        public OrgJacocoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.jacoco.org
         */
        public OrgJacocoOrgLibraryAccessors getOrg() { return laccForOrgJacocoOrgLibraryAccessors; }

    }

    public static class OrgJacocoOrgLibraryAccessors extends SubDependencyFactory {
        private final OrgJacocoOrgJacocoLibraryAccessors laccForOrgJacocoOrgJacocoLibraryAccessors = new OrgJacocoOrgJacocoLibraryAccessors(owner);

        public OrgJacocoOrgLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.jacoco.org.jacoco
         */
        public OrgJacocoOrgJacocoLibraryAccessors getJacoco() { return laccForOrgJacocoOrgJacocoLibraryAccessors; }

    }

    public static class OrgJacocoOrgJacocoLibraryAccessors extends SubDependencyFactory {

        public OrgJacocoOrgJacocoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ant (org.jacoco:org.jacoco.ant)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnt() { return create("org.jacoco.org.jacoco.ant"); }

    }

    public static class OrgJetbrainsLibraryAccessors extends SubDependencyFactory {
        private final OrgJetbrainsKotlinLibraryAccessors laccForOrgJetbrainsKotlinLibraryAccessors = new OrgJetbrainsKotlinLibraryAccessors(owner);
        private final OrgJetbrainsKotlinxLibraryAccessors laccForOrgJetbrainsKotlinxLibraryAccessors = new OrgJetbrainsKotlinxLibraryAccessors(owner);

        public OrgJetbrainsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for annotations (org.jetbrains:annotations)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnnotations() { return create("org.jetbrains.annotations"); }

        /**
         * Returns the group of libraries at org.jetbrains.kotlin
         */
        public OrgJetbrainsKotlinLibraryAccessors getKotlin() { return laccForOrgJetbrainsKotlinLibraryAccessors; }

        /**
         * Returns the group of libraries at org.jetbrains.kotlinx
         */
        public OrgJetbrainsKotlinxLibraryAccessors getKotlinx() { return laccForOrgJetbrainsKotlinxLibraryAccessors; }

    }

    public static class OrgJetbrainsKotlinLibraryAccessors extends SubDependencyFactory {
        private final OrgJetbrainsKotlinKotlinLibraryAccessors laccForOrgJetbrainsKotlinKotlinLibraryAccessors = new OrgJetbrainsKotlinKotlinLibraryAccessors(owner);

        public OrgJetbrainsKotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.jetbrains.kotlin.kotlin
         */
        public OrgJetbrainsKotlinKotlinLibraryAccessors getKotlin() { return laccForOrgJetbrainsKotlinKotlinLibraryAccessors; }

    }

    public static class OrgJetbrainsKotlinKotlinLibraryAccessors extends SubDependencyFactory {
        private final OrgJetbrainsKotlinKotlinAndroidLibraryAccessors laccForOrgJetbrainsKotlinKotlinAndroidLibraryAccessors = new OrgJetbrainsKotlinKotlinAndroidLibraryAccessors(owner);
        private final OrgJetbrainsKotlinKotlinAnnotationLibraryAccessors laccForOrgJetbrainsKotlinKotlinAnnotationLibraryAccessors = new OrgJetbrainsKotlinKotlinAnnotationLibraryAccessors(owner);
        private final OrgJetbrainsKotlinKotlinParcelizeLibraryAccessors laccForOrgJetbrainsKotlinKotlinParcelizeLibraryAccessors = new OrgJetbrainsKotlinKotlinParcelizeLibraryAccessors(owner);
        private final OrgJetbrainsKotlinKotlinStdlibLibraryAccessors laccForOrgJetbrainsKotlinKotlinStdlibLibraryAccessors = new OrgJetbrainsKotlinKotlinStdlibLibraryAccessors(owner);

        public OrgJetbrainsKotlinKotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.jetbrains.kotlin.kotlin.android
         */
        public OrgJetbrainsKotlinKotlinAndroidLibraryAccessors getAndroid() { return laccForOrgJetbrainsKotlinKotlinAndroidLibraryAccessors; }

        /**
         * Returns the group of libraries at org.jetbrains.kotlin.kotlin.annotation
         */
        public OrgJetbrainsKotlinKotlinAnnotationLibraryAccessors getAnnotation() { return laccForOrgJetbrainsKotlinKotlinAnnotationLibraryAccessors; }

        /**
         * Returns the group of libraries at org.jetbrains.kotlin.kotlin.parcelize
         */
        public OrgJetbrainsKotlinKotlinParcelizeLibraryAccessors getParcelize() { return laccForOrgJetbrainsKotlinKotlinParcelizeLibraryAccessors; }

        /**
         * Returns the group of libraries at org.jetbrains.kotlin.kotlin.stdlib
         */
        public OrgJetbrainsKotlinKotlinStdlibLibraryAccessors getStdlib() { return laccForOrgJetbrainsKotlinKotlinStdlibLibraryAccessors; }

    }

    public static class OrgJetbrainsKotlinKotlinAndroidLibraryAccessors extends SubDependencyFactory {
        private final OrgJetbrainsKotlinKotlinAndroidExtensionsLibraryAccessors laccForOrgJetbrainsKotlinKotlinAndroidExtensionsLibraryAccessors = new OrgJetbrainsKotlinKotlinAndroidExtensionsLibraryAccessors(owner);

        public OrgJetbrainsKotlinKotlinAndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.jetbrains.kotlin.kotlin.android.extensions
         */
        public OrgJetbrainsKotlinKotlinAndroidExtensionsLibraryAccessors getExtensions() { return laccForOrgJetbrainsKotlinKotlinAndroidExtensionsLibraryAccessors; }

    }

    public static class OrgJetbrainsKotlinKotlinAndroidExtensionsLibraryAccessors extends SubDependencyFactory {

        public OrgJetbrainsKotlinKotlinAndroidExtensionsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for runtime (org.jetbrains.kotlin:kotlin-android-extensions-runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() { return create("org.jetbrains.kotlin.kotlin.android.extensions.runtime"); }

    }

    public static class OrgJetbrainsKotlinKotlinAnnotationLibraryAccessors extends SubDependencyFactory {
        private final OrgJetbrainsKotlinKotlinAnnotationProcessingLibraryAccessors laccForOrgJetbrainsKotlinKotlinAnnotationProcessingLibraryAccessors = new OrgJetbrainsKotlinKotlinAnnotationProcessingLibraryAccessors(owner);

        public OrgJetbrainsKotlinKotlinAnnotationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.jetbrains.kotlin.kotlin.annotation.processing
         */
        public OrgJetbrainsKotlinKotlinAnnotationProcessingLibraryAccessors getProcessing() { return laccForOrgJetbrainsKotlinKotlinAnnotationProcessingLibraryAccessors; }

    }

    public static class OrgJetbrainsKotlinKotlinAnnotationProcessingLibraryAccessors extends SubDependencyFactory {

        public OrgJetbrainsKotlinKotlinAnnotationProcessingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for gradle (org.jetbrains.kotlin:kotlin-annotation-processing-gradle)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGradle() { return create("org.jetbrains.kotlin.kotlin.annotation.processing.gradle"); }

    }

    public static class OrgJetbrainsKotlinKotlinParcelizeLibraryAccessors extends SubDependencyFactory {

        public OrgJetbrainsKotlinKotlinParcelizeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compiler (org.jetbrains.kotlin:kotlin-parcelize-compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() { return create("org.jetbrains.kotlin.kotlin.parcelize.compiler"); }

            /**
             * Creates a dependency provider for runtime (org.jetbrains.kotlin:kotlin-parcelize-runtime)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() { return create("org.jetbrains.kotlin.kotlin.parcelize.runtime"); }

    }

    public static class OrgJetbrainsKotlinKotlinStdlibLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public OrgJetbrainsKotlinKotlinStdlibLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for stdlib (org.jetbrains.kotlin:kotlin-stdlib)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("org.jetbrains.kotlin.kotlin.stdlib"); }

            /**
             * Creates a dependency provider for common (org.jetbrains.kotlin:kotlin-stdlib-common)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCommon() { return create("org.jetbrains.kotlin.kotlin.stdlib.common"); }

            /**
             * Creates a dependency provider for jdk7 (org.jetbrains.kotlin:kotlin-stdlib-jdk7)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJdk7() { return create("org.jetbrains.kotlin.kotlin.stdlib.jdk7"); }

            /**
             * Creates a dependency provider for jdk8 (org.jetbrains.kotlin:kotlin-stdlib-jdk8)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJdk8() { return create("org.jetbrains.kotlin.kotlin.stdlib.jdk8"); }

    }

    public static class OrgJetbrainsKotlinxLibraryAccessors extends SubDependencyFactory {
        private final OrgJetbrainsKotlinxKotlinxLibraryAccessors laccForOrgJetbrainsKotlinxKotlinxLibraryAccessors = new OrgJetbrainsKotlinxKotlinxLibraryAccessors(owner);

        public OrgJetbrainsKotlinxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.jetbrains.kotlinx.kotlinx
         */
        public OrgJetbrainsKotlinxKotlinxLibraryAccessors getKotlinx() { return laccForOrgJetbrainsKotlinxKotlinxLibraryAccessors; }

    }

    public static class OrgJetbrainsKotlinxKotlinxLibraryAccessors extends SubDependencyFactory {
        private final OrgJetbrainsKotlinxKotlinxCoroutinesLibraryAccessors laccForOrgJetbrainsKotlinxKotlinxCoroutinesLibraryAccessors = new OrgJetbrainsKotlinxKotlinxCoroutinesLibraryAccessors(owner);

        public OrgJetbrainsKotlinxKotlinxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at org.jetbrains.kotlinx.kotlinx.coroutines
         */
        public OrgJetbrainsKotlinxKotlinxCoroutinesLibraryAccessors getCoroutines() { return laccForOrgJetbrainsKotlinxKotlinxCoroutinesLibraryAccessors; }

    }

    public static class OrgJetbrainsKotlinxKotlinxCoroutinesLibraryAccessors extends SubDependencyFactory {
        private final OrgJetbrainsKotlinxKotlinxCoroutinesCoreLibraryAccessors laccForOrgJetbrainsKotlinxKotlinxCoroutinesCoreLibraryAccessors = new OrgJetbrainsKotlinxKotlinxCoroutinesCoreLibraryAccessors(owner);

        public OrgJetbrainsKotlinxKotlinxCoroutinesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (org.jetbrains.kotlinx:kotlinx-coroutines-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() { return create("org.jetbrains.kotlinx.kotlinx.coroutines.android"); }

            /**
             * Creates a dependency provider for bom (org.jetbrains.kotlinx:kotlinx-coroutines-bom)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBom() { return create("org.jetbrains.kotlinx.kotlinx.coroutines.bom"); }

        /**
         * Returns the group of libraries at org.jetbrains.kotlinx.kotlinx.coroutines.core
         */
        public OrgJetbrainsKotlinxKotlinxCoroutinesCoreLibraryAccessors getCore() { return laccForOrgJetbrainsKotlinxKotlinxCoroutinesCoreLibraryAccessors; }

    }

    public static class OrgJetbrainsKotlinxKotlinxCoroutinesCoreLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public OrgJetbrainsKotlinxKotlinxCoroutinesCoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.jetbrains.kotlinx:kotlinx-coroutines-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() { return create("org.jetbrains.kotlinx.kotlinx.coroutines.core"); }

            /**
             * Creates a dependency provider for jvm (org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJvm() { return create("org.jetbrains.kotlinx.kotlinx.coroutines.core.jvm"); }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final AndroidxVersionAccessors vaccForAndroidxVersionAccessors = new AndroidxVersionAccessors(providers, config);
        private final ComVersionAccessors vaccForComVersionAccessors = new ComVersionAccessors(providers, config);
        private final IoVersionAccessors vaccForIoVersionAccessors = new IoVersionAccessors(providers, config);
        private final OrgVersionAccessors vaccForOrgVersionAccessors = new OrgVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.androidx
         */
        public AndroidxVersionAccessors getAndroidx() { return vaccForAndroidxVersionAccessors; }

        /**
         * Returns the group of versions at versions.com
         */
        public ComVersionAccessors getCom() { return vaccForComVersionAccessors; }

        /**
         * Returns the group of versions at versions.io
         */
        public IoVersionAccessors getIo() { return vaccForIoVersionAccessors; }

        /**
         * Returns the group of versions at versions.org
         */
        public OrgVersionAccessors getOrg() { return vaccForOrgVersionAccessors; }

    }

    public static class AndroidxVersionAccessors extends VersionFactory  {

        private final AndroidxArchVersionAccessors vaccForAndroidxArchVersionAccessors = new AndroidxArchVersionAccessors(providers, config);
        private final AndroidxComposeVersionAccessors vaccForAndroidxComposeVersionAccessors = new AndroidxComposeVersionAccessors(providers, config);
        public AndroidxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: androidx.activity (1.7.0-alpha01)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getActivity() { return getVersion("androidx.activity"); }

            /**
             * Returns the version associated to this alias: androidx.camera (1.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCamera() { return getVersion("androidx.camera"); }

            /**
             * Returns the version associated to this alias: androidx.core (1.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCore() { return getVersion("androidx.core"); }

            /**
             * Returns the version associated to this alias: androidx.customview (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCustomview() { return getVersion("androidx.customview"); }

            /**
             * Returns the version associated to this alias: androidx.hilt (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getHilt() { return getVersion("androidx.hilt"); }

            /**
             * Returns the version associated to this alias: androidx.navigation (2.5.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getNavigation() { return getVersion("androidx.navigation"); }

            /**
             * Returns the version associated to this alias: androidx.palette (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPalette() { return getVersion("androidx.palette"); }

            /**
             * Returns the version associated to this alias: androidx.room (2.4.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRoom() { return getVersion("androidx.room"); }

            /**
             * Returns the version associated to this alias: androidx.savedstate (1.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSavedstate() { return getVersion("androidx.savedstate"); }

            /**
             * Returns the version associated to this alias: androidx.sqlite (2.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSqlite() { return getVersion("androidx.sqlite"); }

            /**
             * Returns the version associated to this alias: androidx.vectordrawable (1.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVectordrawable() { return getVersion("androidx.vectordrawable"); }

        /**
         * Returns the group of versions at versions.androidx.arch
         */
        public AndroidxArchVersionAccessors getArch() { return vaccForAndroidxArchVersionAccessors; }

        /**
         * Returns the group of versions at versions.androidx.compose
         */
        public AndroidxComposeVersionAccessors getCompose() { return vaccForAndroidxComposeVersionAccessors; }

    }

    public static class AndroidxArchVersionAccessors extends VersionFactory  {

        public AndroidxArchVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: androidx.arch.core (2.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCore() { return getVersion("androidx.arch.core"); }

    }

    public static class AndroidxComposeVersionAccessors extends VersionFactory  {

        public AndroidxComposeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: androidx.compose.animation (1.3.0-rc01)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAnimation() { return getVersion("androidx.compose.animation"); }

            /**
             * Returns the version associated to this alias: androidx.compose.foundation (1.3.0-rc01)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getFoundation() { return getVersion("androidx.compose.foundation"); }

            /**
             * Returns the version associated to this alias: androidx.compose.runtime (1.3.0-rc01)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRuntime() { return getVersion("androidx.compose.runtime"); }

            /**
             * Returns the version associated to this alias: androidx.compose.ui (1.3.0-rc01)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getUi() { return getVersion("androidx.compose.ui"); }

    }

    public static class ComVersionAccessors extends VersionFactory  {

        private final ComAirbnbVersionAccessors vaccForComAirbnbVersionAccessors = new ComAirbnbVersionAccessors(providers, config);
        private final ComGithubVersionAccessors vaccForComGithubVersionAccessors = new ComGithubVersionAccessors(providers, config);
        private final ComGoogleVersionAccessors vaccForComGoogleVersionAccessors = new ComGoogleVersionAccessors(providers, config);
        private final ComSquareupVersionAccessors vaccForComSquareupVersionAccessors = new ComSquareupVersionAccessors(providers, config);
        public ComVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.com.airbnb
         */
        public ComAirbnbVersionAccessors getAirbnb() { return vaccForComAirbnbVersionAccessors; }

        /**
         * Returns the group of versions at versions.com.github
         */
        public ComGithubVersionAccessors getGithub() { return vaccForComGithubVersionAccessors; }

        /**
         * Returns the group of versions at versions.com.google
         */
        public ComGoogleVersionAccessors getGoogle() { return vaccForComGoogleVersionAccessors; }

        /**
         * Returns the group of versions at versions.com.squareup
         */
        public ComSquareupVersionAccessors getSquareup() { return vaccForComSquareupVersionAccessors; }

    }

    public static class ComAirbnbVersionAccessors extends VersionFactory  {

        public ComAirbnbVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: com.airbnb.android (5.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroid() { return getVersion("com.airbnb.android"); }

    }

    public static class ComGithubVersionAccessors extends VersionFactory  {

        private final ComGithubChuckerteamVersionAccessors vaccForComGithubChuckerteamVersionAccessors = new ComGithubChuckerteamVersionAccessors(providers, config);
        public ComGithubVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.com.github.chuckerteam
         */
        public ComGithubChuckerteamVersionAccessors getChuckerteam() { return vaccForComGithubChuckerteamVersionAccessors; }

    }

    public static class ComGithubChuckerteamVersionAccessors extends VersionFactory  {

        public ComGithubChuckerteamVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: com.github.chuckerteam.chucker (3.5.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getChucker() { return getVersion("com.github.chuckerteam.chucker"); }

    }

    public static class ComGoogleVersionAccessors extends VersionFactory  {

        public ComGoogleVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: com.google.dagger (2.44)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDagger() { return getVersion("com.google.dagger"); }

    }

    public static class ComSquareupVersionAccessors extends VersionFactory  {

        public ComSquareupVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: com.squareup.okio (3.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getOkio() { return getVersion("com.squareup.okio"); }

            /**
             * Returns the version associated to this alias: com.squareup.retrofit2 (2.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRetrofit2() { return getVersion("com.squareup.retrofit2"); }

    }

    public static class IoVersionAccessors extends VersionFactory  {

        private final IoCoilVersionAccessors vaccForIoCoilVersionAccessors = new IoCoilVersionAccessors(providers, config);
        private final IoGithubVersionAccessors vaccForIoGithubVersionAccessors = new IoGithubVersionAccessors(providers, config);
        public IoVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.io.coil
         */
        public IoCoilVersionAccessors getCoil() { return vaccForIoCoilVersionAccessors; }

        /**
         * Returns the group of versions at versions.io.github
         */
        public IoGithubVersionAccessors getGithub() { return vaccForIoGithubVersionAccessors; }

    }

    public static class IoCoilVersionAccessors extends VersionFactory  {

        public IoCoilVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: io.coil.kt (2.2.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKt() { return getVersion("io.coil.kt"); }

    }

    public static class IoGithubVersionAccessors extends VersionFactory  {

        private final IoGithubRaamcostaVersionAccessors vaccForIoGithubRaamcostaVersionAccessors = new IoGithubRaamcostaVersionAccessors(providers, config);
        public IoGithubVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: io.github.aakira (1.4.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAakira() { return getVersion("io.github.aakira"); }

        /**
         * Returns the group of versions at versions.io.github.raamcosta
         */
        public IoGithubRaamcostaVersionAccessors getRaamcosta() { return vaccForIoGithubRaamcostaVersionAccessors; }

    }

    public static class IoGithubRaamcostaVersionAccessors extends VersionFactory  {

        private final IoGithubRaamcostaComposeVersionAccessors vaccForIoGithubRaamcostaComposeVersionAccessors = new IoGithubRaamcostaComposeVersionAccessors(providers, config);
        public IoGithubRaamcostaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.io.github.raamcosta.compose
         */
        public IoGithubRaamcostaComposeVersionAccessors getCompose() { return vaccForIoGithubRaamcostaComposeVersionAccessors; }

    }

    public static class IoGithubRaamcostaComposeVersionAccessors extends VersionFactory  {

        public IoGithubRaamcostaComposeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: io.github.raamcosta.compose.destinations (1.7.22-beta)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDestinations() { return getVersion("io.github.raamcosta.compose.destinations"); }

    }

    public static class OrgVersionAccessors extends VersionFactory  {

        private final OrgJetbrainsVersionAccessors vaccForOrgJetbrainsVersionAccessors = new OrgJetbrainsVersionAccessors(providers, config);
        public OrgVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.org.jetbrains
         */
        public OrgJetbrainsVersionAccessors getJetbrains() { return vaccForOrgJetbrainsVersionAccessors; }

    }

    public static class OrgJetbrainsVersionAccessors extends VersionFactory  {

        public OrgJetbrainsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: org.jetbrains.kotlin (1.7.10)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlin() { return getVersion("org.jetbrains.kotlin"); }

            /**
             * Returns the version associated to this alias: org.jetbrains.kotlinx (1.6.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlinx() { return getVersion("org.jetbrains.kotlinx"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

    public static class PluginAccessors extends PluginFactory {
        private final ComPluginAccessors baccForComPluginAccessors = new ComPluginAccessors(providers, config);
        private final DaggerPluginAccessors baccForDaggerPluginAccessors = new DaggerPluginAccessors(providers, config);
        private final NlPluginAccessors baccForNlPluginAccessors = new NlPluginAccessors(providers, config);
        private final OrgPluginAccessors baccForOrgPluginAccessors = new OrgPluginAccessors(providers, config);

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of bundles at plugins.com
         */
        public ComPluginAccessors getCom() { return baccForComPluginAccessors; }

        /**
         * Returns the group of bundles at plugins.dagger
         */
        public DaggerPluginAccessors getDagger() { return baccForDaggerPluginAccessors; }

        /**
         * Returns the group of bundles at plugins.nl
         */
        public NlPluginAccessors getNl() { return baccForNlPluginAccessors; }

        /**
         * Returns the group of bundles at plugins.org
         */
        public OrgPluginAccessors getOrg() { return baccForOrgPluginAccessors; }

    }

    public static class ComPluginAccessors extends PluginFactory {
        private final ComAndroidPluginAccessors baccForComAndroidPluginAccessors = new ComAndroidPluginAccessors(providers, config);
        private final ComGithubPluginAccessors baccForComGithubPluginAccessors = new ComGithubPluginAccessors(providers, config);
        private final ComGooglePluginAccessors baccForComGooglePluginAccessors = new ComGooglePluginAccessors(providers, config);

        public ComPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of bundles at plugins.com.android
         */
        public ComAndroidPluginAccessors getAndroid() { return baccForComAndroidPluginAccessors; }

        /**
         * Returns the group of bundles at plugins.com.github
         */
        public ComGithubPluginAccessors getGithub() { return baccForComGithubPluginAccessors; }

        /**
         * Returns the group of bundles at plugins.com.google
         */
        public ComGooglePluginAccessors getGoogle() { return baccForComGooglePluginAccessors; }

    }

    public static class ComAndroidPluginAccessors extends PluginFactory {

        public ComAndroidPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for com.android.application to the plugin id 'com.android.application'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getApplication() { return createPlugin("com.android.application"); }

            /**
             * Creates a plugin provider for com.android.library to the plugin id 'com.android.library'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getLibrary() { return createPlugin("com.android.library"); }

    }

    public static class ComGithubPluginAccessors extends PluginFactory {
        private final ComGithubBenPluginAccessors baccForComGithubBenPluginAccessors = new ComGithubBenPluginAccessors(providers, config);

        public ComGithubPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of bundles at plugins.com.github.ben
         */
        public ComGithubBenPluginAccessors getBen() { return baccForComGithubBenPluginAccessors; }

    }

    public static class ComGithubBenPluginAccessors extends PluginFactory {
        private final ComGithubBenManesPluginAccessors baccForComGithubBenManesPluginAccessors = new ComGithubBenManesPluginAccessors(providers, config);

        public ComGithubBenPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of bundles at plugins.com.github.ben.manes
         */
        public ComGithubBenManesPluginAccessors getManes() { return baccForComGithubBenManesPluginAccessors; }

    }

    public static class ComGithubBenManesPluginAccessors extends PluginFactory {

        public ComGithubBenManesPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for com.github.ben.manes.versions to the plugin id 'com.github.ben-manes.versions'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getVersions() { return createPlugin("com.github.ben.manes.versions"); }

    }

    public static class ComGooglePluginAccessors extends PluginFactory {
        private final ComGoogleDaggerPluginAccessors baccForComGoogleDaggerPluginAccessors = new ComGoogleDaggerPluginAccessors(providers, config);
        private final ComGoogleDevtoolsPluginAccessors baccForComGoogleDevtoolsPluginAccessors = new ComGoogleDevtoolsPluginAccessors(providers, config);
        private final ComGoogleFirebasePluginAccessors baccForComGoogleFirebasePluginAccessors = new ComGoogleFirebasePluginAccessors(providers, config);
        private final ComGoogleGmsPluginAccessors baccForComGoogleGmsPluginAccessors = new ComGoogleGmsPluginAccessors(providers, config);

        public ComGooglePluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of bundles at plugins.com.google.dagger
         */
        public ComGoogleDaggerPluginAccessors getDagger() { return baccForComGoogleDaggerPluginAccessors; }

        /**
         * Returns the group of bundles at plugins.com.google.devtools
         */
        public ComGoogleDevtoolsPluginAccessors getDevtools() { return baccForComGoogleDevtoolsPluginAccessors; }

        /**
         * Returns the group of bundles at plugins.com.google.firebase
         */
        public ComGoogleFirebasePluginAccessors getFirebase() { return baccForComGoogleFirebasePluginAccessors; }

        /**
         * Returns the group of bundles at plugins.com.google.gms
         */
        public ComGoogleGmsPluginAccessors getGms() { return baccForComGoogleGmsPluginAccessors; }

    }

    public static class ComGoogleDaggerPluginAccessors extends PluginFactory {
        private final ComGoogleDaggerHiltPluginAccessors baccForComGoogleDaggerHiltPluginAccessors = new ComGoogleDaggerHiltPluginAccessors(providers, config);

        public ComGoogleDaggerPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of bundles at plugins.com.google.dagger.hilt
         */
        public ComGoogleDaggerHiltPluginAccessors getHilt() { return baccForComGoogleDaggerHiltPluginAccessors; }

    }

    public static class ComGoogleDaggerHiltPluginAccessors extends PluginFactory {

        public ComGoogleDaggerHiltPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for com.google.dagger.hilt.android to the plugin id 'com.google.dagger.hilt.android'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getAndroid() { return createPlugin("com.google.dagger.hilt.android"); }

    }

    public static class ComGoogleDevtoolsPluginAccessors extends PluginFactory {

        public ComGoogleDevtoolsPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for com.google.devtools.ksp to the plugin id 'com.google.devtools.ksp'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKsp() { return createPlugin("com.google.devtools.ksp"); }

    }

    public static class ComGoogleFirebasePluginAccessors extends PluginFactory {
        private final ComGoogleFirebaseFirebasePluginAccessors baccForComGoogleFirebaseFirebasePluginAccessors = new ComGoogleFirebaseFirebasePluginAccessors(providers, config);

        public ComGoogleFirebasePluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for com.google.firebase.crashlytics to the plugin id 'com.google.firebase.crashlytics'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getCrashlytics() { return createPlugin("com.google.firebase.crashlytics"); }

        /**
         * Returns the group of bundles at plugins.com.google.firebase.firebase
         */
        public ComGoogleFirebaseFirebasePluginAccessors getFirebase() { return baccForComGoogleFirebaseFirebasePluginAccessors; }

    }

    public static class ComGoogleFirebaseFirebasePluginAccessors extends PluginFactory {

        public ComGoogleFirebaseFirebasePluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for com.google.firebase.firebase.perf to the plugin id 'com.google.firebase.firebase-perf'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getPerf() { return createPlugin("com.google.firebase.firebase.perf"); }

    }

    public static class ComGoogleGmsPluginAccessors extends PluginFactory {
        private final ComGoogleGmsGooglePluginAccessors baccForComGoogleGmsGooglePluginAccessors = new ComGoogleGmsGooglePluginAccessors(providers, config);

        public ComGoogleGmsPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of bundles at plugins.com.google.gms.google
         */
        public ComGoogleGmsGooglePluginAccessors getGoogle() { return baccForComGoogleGmsGooglePluginAccessors; }

    }

    public static class ComGoogleGmsGooglePluginAccessors extends PluginFactory {

        public ComGoogleGmsGooglePluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for com.google.gms.google.services to the plugin id 'com.google.gms.google-services'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getServices() { return createPlugin("com.google.gms.google.services"); }

    }

    public static class DaggerPluginAccessors extends PluginFactory {
        private final DaggerHiltPluginAccessors baccForDaggerHiltPluginAccessors = new DaggerHiltPluginAccessors(providers, config);

        public DaggerPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of bundles at plugins.dagger.hilt
         */
        public DaggerHiltPluginAccessors getHilt() { return baccForDaggerHiltPluginAccessors; }

    }

    public static class DaggerHiltPluginAccessors extends PluginFactory {
        private final DaggerHiltAndroidPluginAccessors baccForDaggerHiltAndroidPluginAccessors = new DaggerHiltAndroidPluginAccessors(providers, config);

        public DaggerHiltPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of bundles at plugins.dagger.hilt.android
         */
        public DaggerHiltAndroidPluginAccessors getAndroid() { return baccForDaggerHiltAndroidPluginAccessors; }

    }

    public static class DaggerHiltAndroidPluginAccessors extends PluginFactory {

        public DaggerHiltAndroidPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for dagger.hilt.android.plugin to the plugin id 'dagger.hilt.android.plugin'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getPlugin() { return createPlugin("dagger.hilt.android.plugin"); }

    }

    public static class NlPluginAccessors extends PluginFactory {
        private final NlLittlerobotsPluginAccessors baccForNlLittlerobotsPluginAccessors = new NlLittlerobotsPluginAccessors(providers, config);

        public NlPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of bundles at plugins.nl.littlerobots
         */
        public NlLittlerobotsPluginAccessors getLittlerobots() { return baccForNlLittlerobotsPluginAccessors; }

    }

    public static class NlLittlerobotsPluginAccessors extends PluginFactory {
        private final NlLittlerobotsVersionPluginAccessors baccForNlLittlerobotsVersionPluginAccessors = new NlLittlerobotsVersionPluginAccessors(providers, config);

        public NlLittlerobotsPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of bundles at plugins.nl.littlerobots.version
         */
        public NlLittlerobotsVersionPluginAccessors getVersion() { return baccForNlLittlerobotsVersionPluginAccessors; }

    }

    public static class NlLittlerobotsVersionPluginAccessors extends PluginFactory {
        private final NlLittlerobotsVersionCatalogPluginAccessors baccForNlLittlerobotsVersionCatalogPluginAccessors = new NlLittlerobotsVersionCatalogPluginAccessors(providers, config);

        public NlLittlerobotsVersionPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of bundles at plugins.nl.littlerobots.version.catalog
         */
        public NlLittlerobotsVersionCatalogPluginAccessors getCatalog() { return baccForNlLittlerobotsVersionCatalogPluginAccessors; }

    }

    public static class NlLittlerobotsVersionCatalogPluginAccessors extends PluginFactory {

        public NlLittlerobotsVersionCatalogPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for nl.littlerobots.version.catalog.update to the plugin id 'nl.littlerobots.version-catalog-update'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getUpdate() { return createPlugin("nl.littlerobots.version.catalog.update"); }

    }

    public static class OrgPluginAccessors extends PluginFactory {
        private final OrgJetbrainsPluginAccessors baccForOrgJetbrainsPluginAccessors = new OrgJetbrainsPluginAccessors(providers, config);

        public OrgPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of bundles at plugins.org.jetbrains
         */
        public OrgJetbrainsPluginAccessors getJetbrains() { return baccForOrgJetbrainsPluginAccessors; }

    }

    public static class OrgJetbrainsPluginAccessors extends PluginFactory {
        private final OrgJetbrainsKotlinPluginAccessors baccForOrgJetbrainsKotlinPluginAccessors = new OrgJetbrainsKotlinPluginAccessors(providers, config);

        public OrgJetbrainsPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of bundles at plugins.org.jetbrains.kotlin
         */
        public OrgJetbrainsKotlinPluginAccessors getKotlin() { return baccForOrgJetbrainsKotlinPluginAccessors; }

    }

    public static class OrgJetbrainsKotlinPluginAccessors extends PluginFactory {

        public OrgJetbrainsKotlinPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for org.jetbrains.kotlin.android to the plugin id 'org.jetbrains.kotlin.android'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getAndroid() { return createPlugin("org.jetbrains.kotlin.android"); }

    }

}
