package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class AH {
    public static final AH H0;
    public static final AH P0;
    public static final AH Q;
    public static final AH X0;
    public static final AH Y;
    public static final AH f1;
    public static final AH g0;
    public static final /* synthetic */ AH[] j1;
    public static final /* synthetic */ YG k1;
    public static final AH o0;
    public static final AH w0;
    public final String B;
    public final boolean C;
    public static final AH D = new AH("UNRESOLVED_TYPE", 0, "Unresolved type for %s", true);
    public static final AH E = new AH("UNRESOLVED_TYPE_PARAMETER_TYPE", 1, "Unresolved type parameter type", true);
    public static final AH F = new AH("UNRESOLVED_CLASS_TYPE", 2, "Unresolved class %s", true);
    public static final AH G = new AH("UNRESOLVED_JAVA_CLASS", 3, "Unresolved java class %s", true);
    public static final AH H = new AH("UNRESOLVED_DECLARATION", 4, "Unresolved declaration %s", true);
    public static final AH I = new AH("UNRESOLVED_KCLASS_CONSTANT_VALUE", 5, "Unresolved type for %s (arrayDimensions=%s)", true);
    public static final AH J = new AH("UNRESOLVED_TYPE_ALIAS", 6, "Unresolved type alias %s", false, 2, null);
    public static final AH K = new AH("RETURN_TYPE", 7, "Return type for %s cannot be resolved", false, 2, null);
    public static final AH L = new AH("RETURN_TYPE_FOR_FUNCTION", 8, "Return type for function cannot be resolved", false, 2, null);
    public static final AH M = new AH("RETURN_TYPE_FOR_PROPERTY", 9, "Return type for property %s cannot be resolved", false, 2, null);
    public static final AH N = new AH("RETURN_TYPE_FOR_CONSTRUCTOR", 10, "Return type for constructor %s cannot be resolved", false, 2, null);
    public static final AH O = new AH("IMPLICIT_RETURN_TYPE_FOR_FUNCTION", 11, "Implicit return type for function %s cannot be resolved", false, 2, null);
    public static final AH P = new AH("IMPLICIT_RETURN_TYPE_FOR_PROPERTY", 12, "Implicit return type for property %s cannot be resolved", false, 2, null);
    public static final AH R = new AH("ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT", 14, "%s() return type", false, 2, null);
    public static final AH S = new AH("RECURSIVE_TYPE", 15, "Recursive type", false, 2, null);
    public static final AH T = new AH("RECURSIVE_TYPE_ALIAS", 16, "Recursive type alias %s", false, 2, null);
    public static final AH U = new AH("RECURSIVE_ANNOTATION_TYPE", 17, "Recursive annotation's type", false, 2, null);
    public static final AH V = new AH("CYCLIC_UPPER_BOUNDS", 18, "Cyclic upper bounds", false, 2, null);
    public static final AH W = new AH("CYCLIC_SUPERTYPES", 19, "Cyclic supertypes", false, 2, null);
    public static final AH X = new AH("UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE", 20, "Cannot infer a lambda context receiver type", false, 2, null);
    public static final AH Z = new AH("UNINFERRED_TYPE_VARIABLE", 22, "Cannot infer a type variable %s", false, 2, null);
    public static final AH a0 = new AH("RESOLUTION_ERROR_TYPE", 23, "Resolution error type (%s)", false, 2, null);
    public static final AH b0 = new AH("ERROR_EXPECTED_TYPE", 24, "Error expected type", false, 2, null);
    public static final AH c0 = new AH("ERROR_DATA_FLOW_TYPE", 25, "Error type for data flow", false, 2, null);
    public static final AH d0 = new AH("ERROR_WHILE_RECONSTRUCTING_BARE_TYPE", 26, "Failed to reconstruct type %s", false, 2, null);
    public static final AH e0 = new AH("UNABLE_TO_SUBSTITUTE_TYPE", 27, "Unable to substitute type (%s)", false, 2, null);
    public static final AH f0 = new AH("DONT_CARE", 28, "Special DONT_CARE type", false, 2, null);
    public static final AH h0 = new AH("FUNCTION_PLACEHOLDER_TYPE", 30, "Function placeholder type (arguments: %s)", false, 2, null);
    public static final AH i0 = new AH("TYPE_FOR_RESULT", 31, "Stubbed 'Result' type", false, 2, null);
    public static final AH j0 = new AH("TYPE_FOR_COMPILER_EXCEPTION", 32, "Error type for a compiler exception while analyzing %s", false, 2, null);
    public static final AH k0 = new AH("ERROR_FLEXIBLE_TYPE", 33, "Error java flexible type with id %s. (%s..%s)", false, 2, null);
    public static final AH l0 = new AH("ERROR_RAW_TYPE", 34, "Error raw type %s", false, 2, null);
    public static final AH m0 = new AH("TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS", 35, "Inconsistent type %s (parameters.size = %s, arguments.size = %s)", false, 2, null);
    public static final AH n0 = new AH("ILLEGAL_TYPE_RANGE_FOR_DYNAMIC", 36, "Illegal type range for dynamic type %s..%s", false, 2, null);
    public static final AH p0 = new AH("CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME", 38, "Couldn't deserialize type parameter %s in %s", false, 2, null);
    public static final AH q0 = new AH("INCONSISTENT_SUSPEND_FUNCTION", 39, "Inconsistent suspend function type in metadata with constructor %s", false, 2, null);
    public static final AH r0 = new AH("UNEXPECTED_FLEXIBLE_TYPE_ID", 40, "Unexpected id of a flexible type %s. (%s..%s)", false, 2, null);
    public static final AH s0 = new AH("UNKNOWN_TYPE", 41, "Unknown type", false, 2, null);
    public static final AH t0 = new AH("NO_TYPE_SPECIFIED", 42, "No type specified for %s", false, 2, null);
    public static final AH u0 = new AH("NO_TYPE_FOR_LOOP_RANGE", 43, "Loop range has no type", false, 2, null);
    public static final AH v0 = new AH("NO_TYPE_FOR_LOOP_PARAMETER", 44, "Loop parameter has no type", false, 2, null);
    public static final AH x0 = new AH("MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER", 46, "Missed a type argument for a type parameter %s", false, 2, null);
    public static final AH y0 = new AH("PARSE_ERROR_ARGUMENT", 47, "Error type for parse error argument %s", false, 2, null);
    public static final AH z0 = new AH("STAR_PROJECTION_IN_CALL", 48, "Error type for star projection directly passing as a call type argument", false, 2, null);
    public static final AH A0 = new AH("PROHIBITED_DYNAMIC_TYPE", 49, "Dynamic type in a not allowed context", false, 2, null);
    public static final AH B0 = new AH("NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT", 50, "Not an annotation type %s in the annotation context", false, 2, null);
    public static final AH C0 = new AH("UNIT_RETURN_TYPE_FOR_INC_DEC", 51, "Unit type returned by inc or dec", false, 2, null);
    public static final AH D0 = new AH("RETURN_NOT_ALLOWED", 52, "Return not allowed", false, 2, null);
    public static final AH E0 = new AH("UNRESOLVED_PARCEL_TYPE", 53, "Unresolved 'Parcel' type", true);
    public static final AH F0 = new AH("KAPT_ERROR_TYPE", 54, "Kapt error type", false, 2, null);
    public static final AH G0 = new AH("SYNTHETIC_ELEMENT_ERROR_TYPE", 55, "Error type for synthetic element", false, 2, null);
    public static final AH I0 = new AH("ERROR_EXPRESSION_TYPE", 57, "Error expression type", false, 2, null);
    public static final AH J0 = new AH("ERROR_RECEIVER_TYPE", 58, "Error receiver type for %s", false, 2, null);
    public static final AH K0 = new AH("ERROR_CONSTANT_VALUE", 59, "Error constant value %s", false, 2, null);
    public static final AH L0 = new AH("EMPTY_CALLABLE_REFERENCE", 60, "Empty callable reference", false, 2, null);
    public static final AH M0 = new AH("UNSUPPORTED_CALLABLE_REFERENCE_TYPE", 61, "Unsupported callable reference type %s", false, 2, null);
    public static final AH N0 = new AH("TYPE_FOR_DELEGATION", 62, "Error delegation type for %s", false, 2, null);
    public static final AH O0 = new AH("UNAVAILABLE_TYPE_FOR_DECLARATION", 63, "Type is unavailable for declaration %s", false, 2, null);
    public static final AH Q0 = new AH("ERROR_TYPE_PROJECTION", 65, "Error type projection", false, 2, null);
    public static final AH R0 = new AH("ERROR_SUPER_TYPE", 66, "Error super type", false, 2, null);
    public static final AH S0 = new AH("SUPER_TYPE_FOR_ERROR_TYPE", 67, "Supertype of error type %s", false, 2, null);
    public static final AH T0 = new AH("ERROR_PROPERTY_TYPE", 68, "Error property type", false, 2, null);
    public static final AH U0 = new AH("ERROR_CLASS", 69, "Error class", false, 2, null);
    public static final AH V0 = new AH("TYPE_FOR_ERROR_TYPE_CONSTRUCTOR", 70, "Type for error type constructor (%s)", false, 2, null);
    public static final AH W0 = new AH("INTERSECTION_OF_ERROR_TYPES", 71, "Intersection of error types %s", false, 2, null);
    public static final AH Y0 = new AH("NOT_FOUND_UNSIGNED_TYPE", 73, "Unsigned type %s not found", false, 2, null);
    public static final AH Z0 = new AH("ERROR_ENUM_TYPE", 74, "Not found the corresponding enum class for given enum entry %s.%s", false, 2, null);
    public static final AH a1 = new AH("NO_RECORDED_TYPE", 75, "Not found recorded type for %s", false, 2, null);
    public static final AH b1 = new AH("NOT_FOUND_DESCRIPTOR_FOR_FUNCTION", 76, "Descriptor not found for function %s", false, 2, null);
    public static final AH c1 = new AH("NOT_FOUND_DESCRIPTOR_FOR_CLASS", 77, "Cannot build class type, descriptor not found for builder %s", false, 2, null);
    public static final AH d1 = new AH("NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER", 78, "Cannot build type parameter type, descriptor not found for builder %s", false, 2, null);
    public static final AH e1 = new AH("UNMAPPED_ANNOTATION_TARGET_TYPE", 79, "Type for unmapped Java annotation target to Kotlin one", false, 2, null);
    public static final AH g1 = new AH("NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION", 81, "No fqName for annotation %s", false, 2, null);
    public static final AH h1 = new AH("NOT_FOUND_FQNAME", 82, "No fqName for %s", false, 2, null);
    public static final AH i1 = new AH("TYPE_FOR_GENERATED_ERROR_EXPRESSION", 83, "Type for generated error expression", false, 2, null);

    static {
        AbstractC2911Yw abstractC2911Yw = null;
        Q = new AH("IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR", 13, "Implicit return type for property accessor %s cannot be resolved", false, 2, abstractC2911Yw);
        Y = new AH("UNINFERRED_LAMBDA_PARAMETER_TYPE", 21, "Cannot infer a lambda parameter type", false, 2, abstractC2911Yw);
        g0 = new AH("STUB_TYPE", 29, "Stub type %s", false, 2, abstractC2911Yw);
        o0 = new AH("CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER", 37, "Unknown type parameter %s. Please try recompiling module containing \"%s\"", false, 2, abstractC2911Yw);
        w0 = new AH("MISSED_TYPE_FOR_PARAMETER", 45, "Missed a type for a value parameter %s", false, 2, abstractC2911Yw);
        AbstractC2911Yw abstractC2911Yw2 = null;
        H0 = new AH("AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE", 56, "Error type in ad hoc resolve for lighter classes", false, 2, abstractC2911Yw2);
        P0 = new AH("ERROR_TYPE_PARAMETER", 64, "Error type parameter", false, 2, abstractC2911Yw2);
        X0 = new AH("CANNOT_COMPUTE_ERASED_BOUND", 72, "Cannot compute erased upper bound of a type parameter %s", false, 2, abstractC2911Yw2);
        f1 = new AH("UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT", 80, "Unknown type for an array element of a java annotation argument", false, 2, abstractC2911Yw2);
        AH[] ahArrA = a();
        j1 = ahArrA;
        k1 = AbstractC3110aH.a(ahArrA);
    }

    public AH(String str, int i, String str2, boolean z) {
        this.B = str2;
        this.C = z;
    }

    public static final /* synthetic */ AH[] a() {
        return new AH[]{D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, a0, b0, c0, d0, e0, f0, g0, h0, i0, j0, k0, l0, m0, n0, o0, p0, q0, r0, s0, t0, u0, v0, w0, x0, y0, z0, A0, B0, C0, D0, E0, F0, G0, H0, I0, J0, K0, L0, M0, N0, O0, P0, Q0, R0, S0, T0, U0, V0, W0, X0, Y0, Z0, a1, b1, c1, d1, e1, f1, g1, h1, i1};
    }

    public static AH valueOf(String str) {
        return (AH) Enum.valueOf(AH.class, str);
    }

    public static AH[] values() {
        return (AH[]) j1.clone();
    }

    public final String c() {
        return this.B;
    }

    public final boolean g() {
        return this.C;
    }

    public /* synthetic */ AH(String str, int i, String str2, boolean z, int i2, AbstractC2911Yw abstractC2911Yw) {
        this(str, i, str2, (i2 & 2) != 0 ? false : z);
    }
}
