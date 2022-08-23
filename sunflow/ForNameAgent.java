import java.lang.instrument.Instrumentation;

public class ForNameAgent extends ClassLoader {
	
	static {
		try {
			
			Class clazz;

			clazz = Class.forName("Harness");
			clazz = Class.forName("org.codehaus.janino.CompileException");
			clazz = Class.forName("org.codehaus.janino.Parser$ParseException");
			clazz = Class.forName("org.codehaus.janino.Scanner$ScanException");
			clazz = Class.forName("org.codehaus.janino.util.CausedException");
			clazz = Class.forName("org.codehaus.janino.util.LocatedException");
			clazz = Class.forName("org.dacapo.harness.Benchmark");
			clazz = Class.forName("org.dacapo.harness.Callback");
			clazz = Class.forName("org.dacapo.harness.Callback$1");
			clazz = Class.forName("org.dacapo.harness.Callback$Mode");
			clazz = Class.forName("org.dacapo.harness.CommandLineArgs");
			clazz = Class.forName("org.dacapo.harness.CommandLineArgs$Methodology");
			clazz = Class.forName("org.dacapo.harness.DacapoClassLoader");
			clazz = Class.forName("org.dacapo.harness.DacapoException");
			clazz = Class.forName("org.dacapo.harness.Digest");
			clazz = Class.forName("org.dacapo.harness.FileDigest");
			clazz = Class.forName("org.dacapo.harness.Sunflow");
			clazz = Class.forName("org.dacapo.harness.TeeOutputStream");
			clazz = Class.forName("org.dacapo.harness.TeePrintStream");
			clazz = Class.forName("org.dacapo.harness.TestHarness");
			clazz = Class.forName("org.dacapo.parser.Config");
			clazz = Class.forName("org.dacapo.parser.Config$1");
			clazz = Class.forName("org.dacapo.parser.Config$OutputFile");
			clazz = Class.forName("org.dacapo.parser.Config$Size");
			clazz = Class.forName("org.dacapo.parser.Config$ThreadModel");
			clazz = Class.forName("org.dacapo.parser.ConfigFile");
			clazz = Class.forName("org.dacapo.parser.ConfigFileConstants");
			clazz = Class.forName("org.dacapo.parser.ConfigFileTokenManager");
			clazz = Class.forName("org.dacapo.parser.ParseException");
			clazz = Class.forName("org.dacapo.parser.SimpleCharStream");
			clazz = Class.forName("org.dacapo.parser.Token");
			clazz = Class.forName("org.dacapo.parser.TokenMgrError");
//			clazz = Class.forName("org.slf4j.ILoggerFactory");
//			clazz = Class.forName("org.slf4j.Logger");
//			clazz = Class.forName("org.slf4j.LoggerFactory");
//			clazz = Class.forName("org.slf4j.Marker");
//			clazz = Class.forName("org.slf4j.helpers.FormattingTuple");
//			clazz = Class.forName("org.slf4j.helpers.MarkerIgnoringBase");
//			clazz = Class.forName("org.slf4j.helpers.MessageFormatter");
//			clazz = Class.forName("org.slf4j.helpers.NOPLogger");
//			clazz = Class.forName("org.slf4j.helpers.NOPLoggerFactory");
//			clazz = Class.forName("org.slf4j.helpers.NamedLoggerBase");
//			clazz = Class.forName("org.slf4j.helpers.SubstituteLoggerFactory");
//			clazz = Class.forName("org.slf4j.helpers.Util");
//			clazz = Class.forName("org.slf4j.impl.SimpleLogger");
//			clazz = Class.forName("org.slf4j.impl.SimpleLogger$1");
//			clazz = Class.forName("org.slf4j.impl.SimpleLoggerFactory");
//			clazz = Class.forName("org.slf4j.impl.StaticLoggerBinder");
//			clazz = Class.forName("org.slf4j.spi.LoggerFactoryBinder");
			clazz = Class.forName("org.sunflow.Benchmark");
			clazz = Class.forName("org.sunflow.Benchmark$BenchmarkScene");
			clazz = Class.forName("org.sunflow.RenderObjectMap");
			clazz = Class.forName("org.sunflow.RenderObjectMap$1");
			clazz = Class.forName("org.sunflow.RenderObjectMap$RenderObjectHandle");
			clazz = Class.forName("org.sunflow.RenderObjectMap$RenderObjectType");
			clazz = Class.forName("org.sunflow.SunflowAPI");
			clazz = Class.forName("org.sunflow.core.AccelerationStructure");
			clazz = Class.forName("org.sunflow.core.AccelerationStructureFactory");
			clazz = Class.forName("org.sunflow.core.BucketOrder");
			clazz = Class.forName("org.sunflow.core.Camera");
			clazz = Class.forName("org.sunflow.core.CameraLens");
			clazz = Class.forName("org.sunflow.core.CausticPhotonMapInterface");
			clazz = Class.forName("org.sunflow.core.Display");
			clazz = Class.forName("org.sunflow.core.Filter");
			clazz = Class.forName("org.sunflow.core.GIEngine");
			clazz = Class.forName("org.sunflow.core.Geometry");
			clazz = Class.forName("org.sunflow.core.ImageSampler");
			clazz = Class.forName("org.sunflow.core.Instance");
			clazz = Class.forName("org.sunflow.core.InstanceList");
			clazz = Class.forName("org.sunflow.core.IntersectionState");
			clazz = Class.forName("org.sunflow.core.IntersectionState$StackNode");
			clazz = Class.forName("org.sunflow.core.LightSample");
			clazz = Class.forName("org.sunflow.core.LightServer");
			clazz = Class.forName("org.sunflow.core.LightServer$1");
			clazz = Class.forName("org.sunflow.core.LightSource");
			clazz = Class.forName("org.sunflow.core.Modifier");
			clazz = Class.forName("org.sunflow.core.Options");
			clazz = Class.forName("org.sunflow.core.ParameterList");
			clazz = Class.forName("org.sunflow.core.ParameterList$1");
			clazz = Class.forName("org.sunflow.core.ParameterList$FloatParameter");
			clazz = Class.forName("org.sunflow.core.ParameterList$InterpolationType");
			clazz = Class.forName("org.sunflow.core.ParameterList$Parameter");
			clazz = Class.forName("org.sunflow.core.ParameterList$ParameterType");
			clazz = Class.forName("org.sunflow.core.PhotonStore");
			clazz = Class.forName("org.sunflow.core.PrimitiveList");
			clazz = Class.forName("org.sunflow.core.Ray");
			clazz = Class.forName("org.sunflow.core.RenderObject");
			clazz = Class.forName("org.sunflow.core.Scene");
			clazz = Class.forName("org.sunflow.core.SceneParser");
			clazz = Class.forName("org.sunflow.core.Shader");
			clazz = Class.forName("org.sunflow.core.ShadingState");
			clazz = Class.forName("org.sunflow.core.ShadingState$LightSampleIterator");
			clazz = Class.forName("org.sunflow.core.Tesselatable");
			clazz = Class.forName("org.sunflow.core.accel.BoundingIntervalHierarchy");
			clazz = Class.forName("org.sunflow.core.accel.BoundingIntervalHierarchy$BuildStats");
			clazz = Class.forName("org.sunflow.core.accel.KDTree");
			clazz = Class.forName("org.sunflow.core.accel.KDTree$BuildStats");
			clazz = Class.forName("org.sunflow.core.accel.KDTree$BuildTask");
			clazz = Class.forName("org.sunflow.core.accel.NullAccelerator");
			clazz = Class.forName("org.sunflow.core.bucket.BucketOrderFactory");
			clazz = Class.forName("org.sunflow.core.bucket.HilbertBucketOrder");
			clazz = Class.forName("org.sunflow.core.camera.PinholeLens");
			clazz = Class.forName("org.sunflow.core.filter.FilterFactory");
			clazz = Class.forName("org.sunflow.core.filter.TriangleFilter");
			clazz = Class.forName("org.sunflow.core.gi.GIEngineFactory");
			clazz = Class.forName("org.sunflow.core.gi.InstantGI");
			clazz = Class.forName("org.sunflow.core.gi.InstantGI$PointLight");
			clazz = Class.forName("org.sunflow.core.gi.InstantGI$PointLightStore");
			clazz = Class.forName("org.sunflow.core.light.TriangleMeshLight");
			clazz = Class.forName("org.sunflow.core.light.TriangleMeshLight$TriangleLight");
			clazz = Class.forName("org.sunflow.core.primitive.Sphere");
			clazz = Class.forName("org.sunflow.core.primitive.TriangleMesh");
			clazz = Class.forName("org.sunflow.core.primitive.TriangleMesh$1");
			clazz = Class.forName("org.sunflow.core.primitive.TriangleMesh$WaldTriangle");
			clazz = Class.forName("org.sunflow.core.renderer.BucketRenderer");
			clazz = Class.forName("org.sunflow.core.renderer.BucketRenderer$BucketThread");
			clazz = Class.forName("org.sunflow.core.renderer.BucketRenderer$ImageSample");
			clazz = Class.forName("org.sunflow.core.renderer.ProgressiveRenderer");
			clazz = Class.forName("org.sunflow.core.shader.DiffuseShader");
			clazz = Class.forName("org.sunflow.core.shader.GlassShader");
			clazz = Class.forName("org.sunflow.core.shader.MirrorShader");
			clazz = Class.forName("org.sunflow.core.tesselatable.BezierMesh");
			clazz = Class.forName("org.sunflow.core.tesselatable.Teapot");
			clazz = Class.forName("org.sunflow.image.Color");
			clazz = Class.forName("org.sunflow.image.RGBSpace");
			clazz = Class.forName("org.sunflow.math.BoundingBox");
			clazz = Class.forName("org.sunflow.math.MathUtils");
			clazz = Class.forName("org.sunflow.math.Matrix4");
			clazz = Class.forName("org.sunflow.math.OrthoNormalBasis");
			clazz = Class.forName("org.sunflow.math.Point2");
			clazz = Class.forName("org.sunflow.math.Point3");
			clazz = Class.forName("org.sunflow.math.QMC");
			clazz = Class.forName("org.sunflow.math.Solvers");
			clazz = Class.forName("org.sunflow.math.Vector3");
			clazz = Class.forName("org.sunflow.system.BenchmarkTest");
			clazz = Class.forName("org.sunflow.system.Memory");
			clazz = Class.forName("org.sunflow.system.SearchPath");
			clazz = Class.forName("org.sunflow.system.Timer");
			clazz = Class.forName("org.sunflow.system.UI");
			clazz = Class.forName("org.sunflow.system.UI$Module");
			clazz = Class.forName("org.sunflow.system.UI$PrintLevel");
			clazz = Class.forName("org.sunflow.system.UserInterface");
			clazz = Class.forName("org.sunflow.system.ui.ConsoleInterface");
			clazz = Class.forName("org.sunflow.util.FastHashMap");
			clazz = Class.forName("org.sunflow.util.FastHashMap$Entry");
			clazz = Class.forName("org.sunflow.util.FastHashMap$EntryIterator");
			clazz = Class.forName("org.sunflow.util.IntArray");
			clazz = Class.forName("soot.rtlib.tamiflex.IUnexpectedReflectiveCallHandler");
			clazz = Class.forName("soot.rtlib.tamiflex.OpaquePredicate");
			clazz = Class.forName("soot.rtlib.tamiflex.ReflectiveCalls");
			clazz = Class.forName("soot.rtlib.tamiflex.ReflectiveCallsWrapper");
			clazz = Class.forName("soot.rtlib.tamiflex.SootSig");
			clazz = Class.forName("soot.rtlib.tamiflex.UnexpectedReflectiveCall");
			clazz = Class.forName("soot.rtlib.tamiflex.DefaultHandler");

		} catch (Exception ex ) {
			assert(false) : ex.toString();
		}
	}
	
	public static void premain(String args, Instrumentation inst) {
		System.out.println("Class Resolver Agent begin");

	}
}
