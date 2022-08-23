import java.lang.instrument.Instrumentation;

public class ForNameAgent extends ClassLoader {
	
	static {
		try {
			
			Class clazz;

			clazz = Class.forName("soot.rtlib.tamiflex.IUnexpectedReflectiveCallHandler");
			clazz = Class.forName("soot.rtlib.tamiflex.OpaquePredicate");
			clazz = Class.forName("soot.rtlib.tamiflex.ReflectiveCalls");
			clazz = Class.forName("soot.rtlib.tamiflex.ReflectiveCallsWrapper");
			clazz = Class.forName("soot.rtlib.tamiflex.SootSig");
			clazz = Class.forName("soot.rtlib.tamiflex.UnexpectedReflectiveCall");
			clazz = Class.forName("spec.benchmarks.check.C1");
			clazz = Class.forName("spec.benchmarks.check.C2");
			clazz = Class.forName("spec.benchmarks.check.C2intf");
			clazz = Class.forName("spec.benchmarks.check.C3");
			clazz = Class.forName("spec.benchmarks.check.C3intf");
			clazz = Class.forName("spec.benchmarks.check.LoopBounds");
			clazz = Class.forName("spec.benchmarks.check.LoopBounds2");
			clazz = Class.forName("spec.benchmarks.check.Main");
			clazz = Class.forName("spec.benchmarks.check.PepTest");
			clazz = Class.forName("spec.benchmarks.check.SideIntf");
			clazz = Class.forName("spec.benchmarks.check.StringAndInt");
			clazz = Class.forName("spec.benchmarks.check.Sub");
			clazz = Class.forName("spec.benchmarks.check.Super");
			clazz = Class.forName("spec.benchmarks.check.subClass");
			clazz = Class.forName("spec.benchmarks.check.superClass");
			clazz = Class.forName("spec.benchmarks.scimark.fft.FFT$1");
			clazz = Class.forName("spec.benchmarks.scimark.fft.FFT");
			clazz = Class.forName("spec.benchmarks.scimark.fft.Main");
			clazz = Class.forName("spec.benchmarks.scimark.utils.Random");
			clazz = Class.forName("spec.benchmarks.scimark.utils.Stopwatch");
			clazz = Class.forName("spec.benchmarks.scimark.utils.kernel");
			clazz = Class.forName("spec.harness.BenchmarkThread");
			clazz = Class.forName("spec.harness.CommandLineParser");
			clazz = Class.forName("spec.harness.Configuration");
			clazz = Class.forName("spec.harness.Context$1");
			clazz = Class.forName("spec.harness.Context");
			clazz = Class.forName("spec.harness.KnownIssues");
			clazz = Class.forName("spec.harness.Launch");
			clazz = Class.forName("spec.harness.ProgramRunner");
			clazz = Class.forName("spec.harness.SpecJVMBenchmark");
			clazz = Class.forName("spec.harness.SpecJVMBenchmarkBase");
			clazz = Class.forName("spec.harness.StopBenchmarkException");
			clazz = Class.forName("spec.harness.Util");
			clazz = Class.forName("spec.harness.analyzer.AnalyzersRunner");
			clazz = Class.forName("spec.harness.results.BenchmarkResult");
			clazz = Class.forName("spec.harness.results.IterationResult");
			clazz = Class.forName("spec.harness.results.LoopResult");
			clazz = Class.forName("spec.harness.results.SuiteResult");
			clazz = Class.forName("spec.harness.results.TestResult");
			clazz = Class.forName("spec.io.FileCache");
			clazz = Class.forName("spec.io.ValidityCheckOutputStream");
			clazz = Class.forName("spec.reporter.BenchmarkChart");
			clazz = Class.forName("spec.reporter.BenchmarkGroupRecords$BenchmarkGroupRecord");
			clazz = Class.forName("spec.reporter.BenchmarkGroupRecords$BenchmarkResultsIterator");
			clazz = Class.forName("spec.reporter.BenchmarkGroupRecords");
			clazz = Class.forName("spec.reporter.BenchmarkRecord$IterationRecord");
			clazz = Class.forName("spec.reporter.BenchmarkRecord");
			clazz = Class.forName("spec.reporter.HTMLWriter");
			clazz = Class.forName("spec.reporter.PlainWriter");
			clazz = Class.forName("spec.reporter.ReportGenerator$Pair");
			clazz = Class.forName("spec.reporter.ReportGenerator");
			clazz = Class.forName("spec.reporter.Reporter");
			clazz = Class.forName("spec.reporter.Utils");
			clazz = Class.forName("spec.reporter.Writer");


		} catch (Exception ex ) {
			assert(false) : ex.toString();
		}
	}
	
	public static void premain(String args, Instrumentation inst) {
		System.out.println("Class Resolver Agent begin");

	}
}
