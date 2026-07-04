package com.daaw;

import org.jetbrains.kotlin.diagnostics.rendering.CommonRenderers;
import org.jetbrains.kotlin.diagnostics.rendering.DefaultErrorMessages;
import org.jetbrains.kotlin.diagnostics.rendering.DiagnosticFactoryToRendererMap;
import org.jetbrains.kotlin.diagnostics.rendering.Renderers;

/* JADX INFO: renamed from: com.daaw.ep, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4375ep implements DefaultErrorMessages.Extension {
    public final DiagnosticFactoryToRendererMap a;

    public C4375ep() {
        DiagnosticFactoryToRendererMap diagnosticFactoryToRendererMap = new DiagnosticFactoryToRendererMap("Compose");
        this.a = diagnosticFactoryToRendererMap;
        diagnosticFactoryToRendererMap.put(C4664fp.b, "@Composable invocations can only happen from the context of a @Composable function");
        diagnosticFactoryToRendererMap.put(C4664fp.c, "Functions which invoke @Composable functions must be marked with the @Composable annotation");
        diagnosticFactoryToRendererMap.put(C4664fp.d, "Function References of @Composable functions are not currently supported");
        diagnosticFactoryToRendererMap.put(C4664fp.j, "Composable calls are not allowed inside the {0} parameter of {1}", Renderers.NAME, Renderers.COMPACT);
        diagnosticFactoryToRendererMap.put(C4664fp.l, "Parameter {0} cannot be inlined inside of lambda argument {1} of {2} without also being annotated with @DisallowComposableCalls", Renderers.NAME, Renderers.NAME, Renderers.NAME);
        diagnosticFactoryToRendererMap.put(C4664fp.m, "Composables marked with @ReadOnlyComposable can only call other @ReadOnlyComposable composables");
        diagnosticFactoryToRendererMap.put(C4664fp.e, "Composable properties are not able to have backing fields");
        diagnosticFactoryToRendererMap.put(C4664fp.n, "Conflicting overloads: {0}", CommonRenderers.commaSeparated(Renderers.FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS));
        diagnosticFactoryToRendererMap.put(C4664fp.f, "Composable properties are not able to have backing fields");
        diagnosticFactoryToRendererMap.put(C4664fp.g, "Composable function cannot be annotated as suspend");
        diagnosticFactoryToRendererMap.put(C4664fp.h, "Abstract Composable functions cannot have parameters with default values");
        diagnosticFactoryToRendererMap.put(C4664fp.i, "Composable main functions are not currently supported");
        diagnosticFactoryToRendererMap.put(C4664fp.o, "Try catch is not supported around composable function invocations.");
        diagnosticFactoryToRendererMap.put(C4664fp.p, "Type inference failed. Expected type mismatch: inferred type is {1} but {0} was expected", Renderers.RENDER_TYPE_WITH_ANNOTATIONS, Renderers.RENDER_TYPE_WITH_ANNOTATIONS);
        diagnosticFactoryToRendererMap.put(C4664fp.q, "Calling a {0} composable function where a {1} composable was expected", Renderers.TO_STRING, Renderers.TO_STRING);
        diagnosticFactoryToRendererMap.put(C4664fp.r, "A {0} composable parameter was provided where a {1} composable was expected", Renderers.TO_STRING, Renderers.TO_STRING);
        diagnosticFactoryToRendererMap.put(C4664fp.s, "The composition target of an override must match the ancestor target");
    }
}
