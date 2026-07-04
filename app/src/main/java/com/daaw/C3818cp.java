package com.daaw;

import java.util.List;
import org.jetbrains.kotlin.compiler.plugin.CliOption;
import org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor;

/* JADX INFO: renamed from: com.daaw.cp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3818cp implements CommandLineProcessor {
    public static final a c = new a(null);
    public static final String d = "androidx.compose.compiler.plugins.kotlin";
    public static final CliOption e = new CliOption("liveLiterals", "<true|false>", "Enable Live Literals code generation", false, false);
    public static final CliOption f = new CliOption("liveLiteralsEnabled", "<true|false>", "Enable Live Literals code generation (with per-file enabled flags)", false, false);
    public static final CliOption g = new CliOption("generateFunctionKeyMetaClasses", "<true|false>", "Generate function key meta classes with annotations indicating the functions and their group keys. Generally used for tooling.", false, false);
    public static final CliOption h = new CliOption("sourceInformation", "<true|false>", "Include source information in generated code", false, false);
    public static final CliOption i = new CliOption("metricsDestination", "<path>", "Save compose build metrics to this folder", false, false);
    public static final CliOption j = new CliOption("reportsDestination", "<path>", "Save compose build reports to this folder", false, false);
    public static final CliOption k = new CliOption("intrinsicRemember", "<true|false>", "Include source information in generated code", false, false);
    public static final CliOption l = new CliOption("suppressKotlinVersionCompatibilityCheck", "<true|false>", "Suppress Kotlin version compatibility check", false, false);
    public static final CliOption m = new CliOption("generateDecoys", "<true|false>", "Generate decoy methods in IR transform", false, false);
    public final String a = d;
    public final List b = AbstractC1599Mm.n(e, f, g, h, i, j, k, l, m);

    /* JADX INFO: renamed from: com.daaw.cp$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }
}
