import java.lang.instrument.Instrumentation;

public class ForNameAgent extends ClassLoader {
	
	static {
		try {
			
			Class clazz;
			clazz = Class.forName("Harness");
			clazz = Class.forName("dacapo.Benchmark");
			clazz = Class.forName("dacapo.Callback");
			clazz = Class.forName("dacapo.DacapoException");
			clazz = Class.forName("dacapo.Digest");
			clazz = Class.forName("dacapo.FileDigest");
			clazz = Class.forName("dacapo.TeeOutputStream");
			clazz = Class.forName("dacapo.TeePrintStream");
			clazz = Class.forName("dacapo.TestHarness");
			clazz = Class.forName("dacapo.parser.Config$OutputFile");
			clazz = Class.forName("dacapo.parser.Config$Size");
			clazz = Class.forName("dacapo.parser.Config");
			clazz = Class.forName("dacapo.parser.ConfigFile");
			clazz = Class.forName("dacapo.parser.ConfigFileConstants");
			clazz = Class.forName("dacapo.parser.ConfigFileTokenManager");
			clazz = Class.forName("dacapo.parser.ParseException");
			clazz = Class.forName("dacapo.parser.SimpleCharStream");
			clazz = Class.forName("dacapo.parser.Token");
			clazz = Class.forName("dacapo.parser.TokenMgrError");
			clazz = Class.forName("dacapo.xalan.XalanHarness$WorkQueue");
			clazz = Class.forName("dacapo.xalan.XalanHarness$XalanWorker");
			clazz = Class.forName("dacapo.xalan.XalanHarness");
			clazz = Class.forName("org.apache.xalan.Version");
			clazz = Class.forName("org.apache.xalan.extensions.ExpressionContext");
			clazz = Class.forName("org.apache.xalan.extensions.ExtensionNamespacesManager");
			clazz = Class.forName("org.apache.xalan.extensions.ExtensionsTable");
			clazz = Class.forName("org.apache.xalan.res.XSLMessages");
			clazz = Class.forName("org.apache.xalan.serialize.CharInfo");
			clazz = Class.forName("org.apache.xalan.serialize.DOMSerializer");
			clazz = Class.forName("org.apache.xalan.serialize.ElemDesc");
			clazz = Class.forName("org.apache.xalan.serialize.EncodingInfo");
			clazz = Class.forName("org.apache.xalan.serialize.Encodings");
			clazz = Class.forName("org.apache.xalan.serialize.Serializer");
			clazz = Class.forName("org.apache.xalan.serialize.SerializerFactory");
			clazz = Class.forName("org.apache.xalan.serialize.SerializerToHTML");
			clazz = Class.forName("org.apache.xalan.serialize.SerializerToText");
			clazz = Class.forName("org.apache.xalan.serialize.SerializerToXML");
			clazz = Class.forName("org.apache.xalan.serialize.WriterToASCI");
			clazz = Class.forName("org.apache.xalan.serialize.WriterToUTF8");
			clazz = Class.forName("org.apache.xalan.serialize.WriterToUTF8Buffered");
			clazz = Class.forName("org.apache.xalan.templates.AVT");
			clazz = Class.forName("org.apache.xalan.templates.AVTPart");
			clazz = Class.forName("org.apache.xalan.templates.AVTPartSimple");
			clazz = Class.forName("org.apache.xalan.templates.AVTPartXPath");
			clazz = Class.forName("org.apache.xalan.templates.DecimalFormatProperties");
			clazz = Class.forName("org.apache.xalan.templates.ElemApplyTemplates");
			clazz = Class.forName("org.apache.xalan.templates.ElemAttribute");
			clazz = Class.forName("org.apache.xalan.templates.ElemAttributeSet");
			clazz = Class.forName("org.apache.xalan.templates.ElemCallTemplate");
			clazz = Class.forName("org.apache.xalan.templates.ElemChoose");
			clazz = Class.forName("org.apache.xalan.templates.ElemCopy");
			clazz = Class.forName("org.apache.xalan.templates.ElemElement");
			clazz = Class.forName("org.apache.xalan.templates.ElemExtensionCall");
			clazz = Class.forName("org.apache.xalan.templates.ElemExtensionDecl");
			clazz = Class.forName("org.apache.xalan.templates.ElemExtensionScript");
			clazz = Class.forName("org.apache.xalan.templates.ElemFallback");
			clazz = Class.forName("org.apache.xalan.templates.ElemForEach");
			clazz = Class.forName("org.apache.xalan.templates.ElemIf");
			clazz = Class.forName("org.apache.xalan.templates.ElemLiteralResult");
			clazz = Class.forName("org.apache.xalan.templates.ElemMessage");
			clazz = Class.forName("org.apache.xalan.templates.ElemNumber$MyPrefixResolver");
			clazz = Class.forName("org.apache.xalan.templates.ElemNumber$NumberFormatStringTokenizer");
			clazz = Class.forName("org.apache.xalan.templates.ElemNumber");
			clazz = Class.forName("org.apache.xalan.templates.ElemOtherwise");
			clazz = Class.forName("org.apache.xalan.templates.ElemParam");
			clazz = Class.forName("org.apache.xalan.templates.ElemSort");
			clazz = Class.forName("org.apache.xalan.templates.ElemTemplate");
			clazz = Class.forName("org.apache.xalan.templates.ElemTemplateElement");
			clazz = Class.forName("org.apache.xalan.templates.ElemText");
			clazz = Class.forName("org.apache.xalan.templates.ElemTextLiteral");
			clazz = Class.forName("org.apache.xalan.templates.ElemUse");
			clazz = Class.forName("org.apache.xalan.templates.ElemValueOf");
			clazz = Class.forName("org.apache.xalan.templates.ElemVariable");
			clazz = Class.forName("org.apache.xalan.templates.ElemWhen");
			clazz = Class.forName("org.apache.xalan.templates.ElemWithParam");
			clazz = Class.forName("org.apache.xalan.templates.FuncKey");
			clazz = Class.forName("org.apache.xalan.templates.KeyDeclaration");
			clazz = Class.forName("org.apache.xalan.templates.NamespaceAlias");
			clazz = Class.forName("org.apache.xalan.templates.OutputProperties");
			clazz = Class.forName("org.apache.xalan.templates.Stylesheet");
			clazz = Class.forName("org.apache.xalan.templates.StylesheetComposed");
			clazz = Class.forName("org.apache.xalan.templates.StylesheetRoot$ComposeState");
			clazz = Class.forName("org.apache.xalan.templates.StylesheetRoot");
			clazz = Class.forName("org.apache.xalan.templates.TemplateList");
			clazz = Class.forName("org.apache.xalan.templates.TemplateSubPatternAssociation");
			clazz = Class.forName("org.apache.xalan.templates.WhiteSpaceInfo");
			clazz = Class.forName("org.apache.xalan.templates.XMLNSDecl");
			clazz = Class.forName("org.apache.xalan.templates.XSLTVisitable");
			clazz = Class.forName("org.apache.xalan.templates.XSLTVisitor");
			clazz = Class.forName("org.apache.xalan.templates.XUnresolvedVariable");
			clazz = Class.forName("org.apache.xalan.trace.TraceManager");
			clazz = Class.forName("org.apache.xalan.transformer.ClonerToResultTree");
			clazz = Class.forName("org.apache.xalan.transformer.Counter");
			clazz = Class.forName("org.apache.xalan.transformer.CountersTable");
			clazz = Class.forName("org.apache.xalan.transformer.DecimalToRoman");
			clazz = Class.forName("org.apache.xalan.transformer.KeyManager");
			clazz = Class.forName("org.apache.xalan.transformer.MsgMgr");
			clazz = Class.forName("org.apache.xalan.transformer.QueuedEvents");
			clazz = Class.forName("org.apache.xalan.transformer.ResultTreeHandler$QueuedStateSnapshot");
			clazz = Class.forName("org.apache.xalan.transformer.ResultTreeHandler");
			clazz = Class.forName("org.apache.xalan.transformer.SerializerSwitcher");
			clazz = Class.forName("org.apache.xalan.transformer.StackGuard");
			clazz = Class.forName("org.apache.xalan.transformer.TransformSnapshot");
			clazz = Class.forName("org.apache.xalan.transformer.TransformState");
			clazz = Class.forName("org.apache.xalan.transformer.TransformerClient");
			clazz = Class.forName("org.apache.xalan.transformer.TransformerImpl$ThreadControler");
			clazz = Class.forName("org.apache.xalan.transformer.TransformerImpl");
			clazz = Class.forName("org.apache.xerces.impl.Constants$ArrayEnumeration");
			clazz = Class.forName("org.apache.xerces.impl.Constants");
			clazz = Class.forName("org.apache.xerces.impl.RevalidationHandler");
			clazz = Class.forName("org.apache.xerces.impl.XML11DTDScannerImpl");
			clazz = Class.forName("org.apache.xerces.impl.XML11DocumentScannerImpl");
			clazz = Class.forName("org.apache.xerces.impl.XML11EntityScanner");
			clazz = Class.forName("org.apache.xerces.impl.XML11NSDocumentScannerImpl");
			clazz = Class.forName("org.apache.xerces.impl.XMLDTDScannerImpl");
			clazz = Class.forName("org.apache.xerces.impl.XMLDocumentFragmentScannerImpl$Dispatcher");
			clazz = Class.forName("org.apache.xerces.impl.XMLDocumentFragmentScannerImpl$ElementStack");
			clazz = Class.forName("org.apache.xerces.impl.XMLDocumentFragmentScannerImpl$FragmentContentDispatcher");
			clazz = Class.forName("org.apache.xerces.impl.XMLDocumentFragmentScannerImpl");
			clazz = Class.forName("org.apache.xerces.impl.XMLDocumentScannerImpl$ContentDispatcher");
			clazz = Class.forName("org.apache.xerces.impl.XMLDocumentScannerImpl$DTDDispatcher");
			clazz = Class.forName("org.apache.xerces.impl.XMLDocumentScannerImpl$PrologDispatcher");
			clazz = Class.forName("org.apache.xerces.impl.XMLDocumentScannerImpl$TrailingMiscDispatcher");
			clazz = Class.forName("org.apache.xerces.impl.XMLDocumentScannerImpl$XMLDeclDispatcher");
			clazz = Class.forName("org.apache.xerces.impl.XMLDocumentScannerImpl");
			clazz = Class.forName("org.apache.xerces.impl.XMLEntityHandler");
			clazz = Class.forName("org.apache.xerces.impl.XMLEntityManager$CharacterBuffer");
			clazz = Class.forName("org.apache.xerces.impl.XMLEntityManager$CharacterBufferPool");
			clazz = Class.forName("org.apache.xerces.impl.XMLEntityManager$Entity");
			clazz = Class.forName("org.apache.xerces.impl.XMLEntityManager$ExternalEntity");
			clazz = Class.forName("org.apache.xerces.impl.XMLEntityManager$InternalEntity");
			clazz = Class.forName("org.apache.xerces.impl.XMLEntityManager$RewindableInputStream");
			clazz = Class.forName("org.apache.xerces.impl.XMLEntityManager$ScannedEntity");
			clazz = Class.forName("org.apache.xerces.impl.XMLEntityManager");
			clazz = Class.forName("org.apache.xerces.impl.XMLEntityScanner");
			clazz = Class.forName("org.apache.xerces.impl.XMLErrorReporter");
			clazz = Class.forName("org.apache.xerces.impl.XMLNSDocumentScannerImpl$NSContentDispatcher");
			clazz = Class.forName("org.apache.xerces.impl.XMLNSDocumentScannerImpl");
			clazz = Class.forName("org.apache.xerces.impl.XMLScanner");
			clazz = Class.forName("org.apache.xerces.impl.XMLVersionDetector");
			clazz = Class.forName("org.apache.xerces.impl.dtd.BalancedDTDGrammar");
			clazz = Class.forName("org.apache.xerces.impl.dtd.DTDGrammar");
			clazz = Class.forName("org.apache.xerces.impl.dtd.DTDGrammarBucket");
			clazz = Class.forName("org.apache.xerces.impl.dtd.XML11DTDProcessor");
			clazz = Class.forName("org.apache.xerces.impl.dtd.XML11DTDValidator");
			clazz = Class.forName("org.apache.xerces.impl.dtd.XML11NSDTDValidator");
			clazz = Class.forName("org.apache.xerces.impl.dtd.XMLAttributeDecl");
			clazz = Class.forName("org.apache.xerces.impl.dtd.XMLDTDDescription");
			clazz = Class.forName("org.apache.xerces.impl.dtd.XMLDTDLoader");
			clazz = Class.forName("org.apache.xerces.impl.dtd.XMLDTDProcessor");
			clazz = Class.forName("org.apache.xerces.impl.dtd.XMLDTDValidator");
			clazz = Class.forName("org.apache.xerces.impl.dtd.XMLDTDValidatorFilter");
			clazz = Class.forName("org.apache.xerces.impl.dtd.XMLElementDecl");
			clazz = Class.forName("org.apache.xerces.impl.dtd.XMLEntityDecl");
			clazz = Class.forName("org.apache.xerces.impl.dtd.XMLNSDTDValidator");
			clazz = Class.forName("org.apache.xerces.impl.dtd.XMLSimpleType");
			clazz = Class.forName("org.apache.xerces.impl.dv.DTDDVFactory");
			clazz = Class.forName("org.apache.xerces.impl.dv.DVFactoryException");
			clazz = Class.forName("org.apache.xerces.impl.dv.DatatypeException");
			clazz = Class.forName("org.apache.xerces.impl.dv.DatatypeValidator");
			clazz = Class.forName("org.apache.xerces.impl.dv.InvalidDatatypeValueException");
			clazz = Class.forName("org.apache.xerces.impl.dv.ObjectFactory$ConfigurationError");
			clazz = Class.forName("org.apache.xerces.impl.dv.ObjectFactory");
			clazz = Class.forName("org.apache.xerces.impl.dv.SecuritySupport$1");
			clazz = Class.forName("org.apache.xerces.impl.dv.SecuritySupport$2");
			clazz = Class.forName("org.apache.xerces.impl.dv.SecuritySupport");
			clazz = Class.forName("org.apache.xerces.impl.dv.ValidationContext");
			clazz = Class.forName("org.apache.xerces.impl.dv.dtd.DTDDVFactoryImpl");
			clazz = Class.forName("org.apache.xerces.impl.dv.dtd.ENTITYDatatypeValidator");
			clazz = Class.forName("org.apache.xerces.impl.dv.dtd.IDDatatypeValidator");
			clazz = Class.forName("org.apache.xerces.impl.dv.dtd.IDREFDatatypeValidator");
			clazz = Class.forName("org.apache.xerces.impl.dv.dtd.ListDatatypeValidator");
			clazz = Class.forName("org.apache.xerces.impl.dv.dtd.NMTOKENDatatypeValidator");
			clazz = Class.forName("org.apache.xerces.impl.dv.dtd.NOTATIONDatatypeValidator");
			clazz = Class.forName("org.apache.xerces.impl.dv.dtd.StringDatatypeValidator");
			clazz = Class.forName("org.apache.xerces.impl.io.ASCIIReader");
			clazz = Class.forName("org.apache.xerces.impl.io.MalformedByteSequenceException");
			clazz = Class.forName("org.apache.xerces.impl.io.UCSReader");
			clazz = Class.forName("org.apache.xerces.impl.io.UTF8Reader");
			clazz = Class.forName("org.apache.xerces.impl.msg.XMLMessageFormatter");
			clazz = Class.forName("org.apache.xerces.impl.validation.EntityState");
			clazz = Class.forName("org.apache.xerces.impl.validation.ValidationManager");
			clazz = Class.forName("org.apache.xerces.impl.validation.ValidationState");
			clazz = Class.forName("org.apache.xerces.impl.xs.XMLSchemaValidator");
			clazz = Class.forName("org.apache.xerces.impl.xs.identity.FieldActivator");
			clazz = Class.forName("org.apache.xerces.jaxp.JAXPConstants");
			clazz = Class.forName("org.apache.xerces.jaxp.JAXPValidatorComponent");
			clazz = Class.forName("org.apache.xerces.jaxp.SAXParserFactoryImpl");
			clazz = Class.forName("org.apache.xerces.jaxp.SAXParserImpl$JAXPSAXParser");
			clazz = Class.forName("org.apache.xerces.jaxp.SAXParserImpl");
			clazz = Class.forName("org.apache.xerces.jaxp.TeeXMLDocumentFilterImpl");
			clazz = Class.forName("org.apache.xerces.parsers.AbstractSAXParser$1");
			clazz = Class.forName("org.apache.xerces.parsers.AbstractSAXParser$2");
			clazz = Class.forName("org.apache.xerces.parsers.AbstractSAXParser$AttributesProxy");
			clazz = Class.forName("org.apache.xerces.parsers.AbstractSAXParser$LocatorProxy");
			clazz = Class.forName("org.apache.xerces.parsers.AbstractSAXParser");
			clazz = Class.forName("org.apache.xerces.parsers.AbstractXMLDocumentParser");
			clazz = Class.forName("org.apache.xerces.parsers.ObjectFactory$ConfigurationError");
			clazz = Class.forName("org.apache.xerces.parsers.ObjectFactory");
			clazz = Class.forName("org.apache.xerces.parsers.SAXParser");
			clazz = Class.forName("org.apache.xerces.parsers.SecuritySupport$1");
			clazz = Class.forName("org.apache.xerces.parsers.SecuritySupport$2");
			clazz = Class.forName("org.apache.xerces.parsers.SecuritySupport$4");
			clazz = Class.forName("org.apache.xerces.parsers.SecuritySupport$6");
			clazz = Class.forName("org.apache.xerces.parsers.SecuritySupport$7");
			clazz = Class.forName("org.apache.xerces.parsers.SecuritySupport");
			clazz = Class.forName("org.apache.xerces.parsers.XIncludeAwareParserConfiguration");
			clazz = Class.forName("org.apache.xerces.parsers.XML11Configurable");
			clazz = Class.forName("org.apache.xerces.parsers.XML11Configuration");
			clazz = Class.forName("org.apache.xerces.parsers.XMLParser");
			clazz = Class.forName("org.apache.xerces.util.AugmentationsImpl$AugmentationsItemsContainer");
			clazz = Class.forName("org.apache.xerces.util.AugmentationsImpl$LargeContainer");
			clazz = Class.forName("org.apache.xerces.util.AugmentationsImpl$SmallContainer");
			clazz = Class.forName("org.apache.xerces.util.AugmentationsImpl");
			clazz = Class.forName("org.apache.xerces.util.ErrorHandlerWrapper");
			clazz = Class.forName("org.apache.xerces.util.MessageFormatter");
			clazz = Class.forName("org.apache.xerces.util.NamespaceSupport");
			clazz = Class.forName("org.apache.xerces.util.ParserConfigurationSettings");
			clazz = Class.forName("org.apache.xerces.util.SymbolTable$Entry");
			clazz = Class.forName("org.apache.xerces.util.SymbolTable");
			clazz = Class.forName("org.apache.xerces.util.URI$MalformedURIException");
			clazz = Class.forName("org.apache.xerces.util.URI");
			clazz = Class.forName("org.apache.xerces.util.XMLAttributesImpl$Attribute");
			clazz = Class.forName("org.apache.xerces.util.XMLAttributesImpl");
			clazz = Class.forName("org.apache.xerces.util.XMLChar");
			clazz = Class.forName("org.apache.xerces.util.XMLResourceIdentifierImpl");
			clazz = Class.forName("org.apache.xerces.util.XMLStringBuffer");
			clazz = Class.forName("org.apache.xerces.util.XMLSymbols");
			clazz = Class.forName("org.apache.xerces.xni.Augmentations");
			clazz = Class.forName("org.apache.xerces.xni.NamespaceContext");
			clazz = Class.forName("org.apache.xerces.xni.QName");
			clazz = Class.forName("org.apache.xerces.xni.XMLAttributes");
			clazz = Class.forName("org.apache.xerces.xni.XMLDTDContentModelHandler");
			clazz = Class.forName("org.apache.xerces.xni.XMLDTDHandler");
			clazz = Class.forName("org.apache.xerces.xni.XMLDocumentHandler");
			clazz = Class.forName("org.apache.xerces.xni.XMLLocator");
			clazz = Class.forName("org.apache.xerces.xni.XMLResourceIdentifier");
			clazz = Class.forName("org.apache.xerces.xni.XMLString");
			clazz = Class.forName("org.apache.xerces.xni.XNIException");
			clazz = Class.forName("org.apache.xerces.xni.grammars.Grammar");
			clazz = Class.forName("org.apache.xerces.xni.grammars.XMLDTDDescription");
			clazz = Class.forName("org.apache.xerces.xni.grammars.XMLGrammarDescription");
			clazz = Class.forName("org.apache.xerces.xni.grammars.XMLGrammarLoader");
			clazz = Class.forName("org.apache.xerces.xni.grammars.XMLGrammarPool");
			clazz = Class.forName("org.apache.xerces.xni.parser.XMLComponent");
			clazz = Class.forName("org.apache.xerces.xni.parser.XMLComponentManager");
			clazz = Class.forName("org.apache.xerces.xni.parser.XMLConfigurationException");
			clazz = Class.forName("org.apache.xerces.xni.parser.XMLDTDContentModelFilter");
			clazz = Class.forName("org.apache.xerces.xni.parser.XMLDTDContentModelSource");
			clazz = Class.forName("org.apache.xerces.xni.parser.XMLDTDFilter");
			clazz = Class.forName("org.apache.xerces.xni.parser.XMLDTDScanner");
			clazz = Class.forName("org.apache.xerces.xni.parser.XMLDTDSource");
			clazz = Class.forName("org.apache.xerces.xni.parser.XMLDocumentFilter");
			clazz = Class.forName("org.apache.xerces.xni.parser.XMLDocumentScanner");
			clazz = Class.forName("org.apache.xerces.xni.parser.XMLDocumentSource");
			clazz = Class.forName("org.apache.xerces.xni.parser.XMLEntityResolver");
			clazz = Class.forName("org.apache.xerces.xni.parser.XMLErrorHandler");
			clazz = Class.forName("org.apache.xerces.xni.parser.XMLInputSource");
			clazz = Class.forName("org.apache.xerces.xni.parser.XMLParseException");
			clazz = Class.forName("org.apache.xerces.xni.parser.XMLParserConfiguration");
			clazz = Class.forName("org.apache.xerces.xni.parser.XMLPullParserConfiguration");
			clazz = Class.forName("org.apache.xerces.xs.PSVIProvider");
			clazz = Class.forName("org.apache.xml.dtm.Axis");
			clazz = Class.forName("org.apache.xml.dtm.DTM");
			clazz = Class.forName("org.apache.xml.dtm.DTMAxisIterator");
			clazz = Class.forName("org.apache.xml.dtm.DTMAxisTraverser");
			clazz = Class.forName("org.apache.xml.dtm.DTMConfigurationException");
			clazz = Class.forName("org.apache.xml.dtm.DTMDOMException");
			clazz = Class.forName("org.apache.xml.dtm.DTMException");
			clazz = Class.forName("org.apache.xml.dtm.DTMIterator");
			clazz = Class.forName("org.apache.xml.dtm.DTMManager");
			clazz = Class.forName("org.apache.xml.dtm.DTMWSFilter");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMAxisIteratorBase");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBase");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseIterators$AncestorIterator");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseIterators$ChildrenIterator");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseIterators$DescendantIterator");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseIterators$InternalAxisIteratorBase");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseIterators$ParentIterator");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseIterators$PrecedingSiblingIterator");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseIterators$SingletonIterator");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseIterators$TypedAncestorIterator");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseIterators$TypedChildrenIterator");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseIterators$TypedDescendantIterator");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseIterators$TypedSingletonIterator");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseIterators");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseTraversers$AllFromNodeTraverser");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseTraversers$AllFromRootTraverser");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseTraversers$AncestorOrSelfTraverser");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseTraversers$AncestorTraverser");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseTraversers$AttributeTraverser");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseTraversers$ChildTraverser");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseTraversers$DescendantFromRootTraverser");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseTraversers$DescendantOrSelfFromRootTraverser");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseTraversers$DescendantOrSelfTraverser");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseTraversers$DescendantTraverser");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseTraversers$FollowingSiblingTraverser");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseTraversers$FollowingTraverser");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseTraversers$IndexedDTMAxisTraverser");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseTraversers$NamespaceDeclsTraverser");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseTraversers$NamespaceTraverser");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseTraversers$ParentTraverser");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseTraversers$PrecedingAndAncestorTraverser");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseTraversers$PrecedingSiblingTraverser");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseTraversers$PrecedingTraverser");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseTraversers$RootTraverser");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseTraversers$SelfTraverser");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMDefaultBaseTraversers");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMManagerDefault");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMNodeProxy$DTMNodeProxyImplementation");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMNodeProxy");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMStringPool");
			clazz = Class.forName("org.apache.xml.dtm.ref.DTMTreeWalker");
			clazz = Class.forName("org.apache.xml.dtm.ref.ExpandedNameTable$ExtendedType");
			clazz = Class.forName("org.apache.xml.dtm.ref.ExpandedNameTable");
			clazz = Class.forName("org.apache.xml.dtm.ref.IncrementalSAXSource");
			clazz = Class.forName("org.apache.xml.dtm.ref.dom2dtm.DOM2DTM$CharacterNodeHandler");
			clazz = Class.forName("org.apache.xml.dtm.ref.sax2dtm.SAX2DTM");
			clazz = Class.forName("org.apache.xml.dtm.ref.sax2dtm.SAX2RTFDTM");
			clazz = Class.forName("org.apache.xml.utils.BoolStack");
			clazz = Class.forName("org.apache.xml.utils.CharKey");
			clazz = Class.forName("org.apache.xml.utils.Context2");
			clazz = Class.forName("org.apache.xml.utils.DOMBuilder");
			clazz = Class.forName("org.apache.xml.utils.DefaultErrorHandler");
			clazz = Class.forName("org.apache.xml.utils.FastStringBuffer");
			clazz = Class.forName("org.apache.xml.utils.IntStack");
			clazz = Class.forName("org.apache.xml.utils.IntVector");
			clazz = Class.forName("org.apache.xml.utils.MutableAttrListImpl");
			clazz = Class.forName("org.apache.xml.utils.NamespaceSupport2");
			clazz = Class.forName("org.apache.xml.utils.NodeConsumer");
			clazz = Class.forName("org.apache.xml.utils.NodeVector");
			clazz = Class.forName("org.apache.xml.utils.ObjectPool");
			clazz = Class.forName("org.apache.xml.utils.ObjectStack");
			clazz = Class.forName("org.apache.xml.utils.ObjectVector");
			clazz = Class.forName("org.apache.xml.utils.PrefixResolver");
			clazz = Class.forName("org.apache.xml.utils.QName");
			clazz = Class.forName("org.apache.xml.utils.SAXSourceLocator");
			clazz = Class.forName("org.apache.xml.utils.StringBufferPool");
			clazz = Class.forName("org.apache.xml.utils.StringToIntTable");
			clazz = Class.forName("org.apache.xml.utils.StringVector");
			clazz = Class.forName("org.apache.xml.utils.SuballocatedIntVector");
			clazz = Class.forName("org.apache.xml.utils.SystemIDResolver");
			clazz = Class.forName("org.apache.xml.utils.Trie$Node");
			clazz = Class.forName("org.apache.xml.utils.Trie");
			clazz = Class.forName("org.apache.xml.utils.URI$MalformedURIException");
			clazz = Class.forName("org.apache.xml.utils.URI");
			clazz = Class.forName("org.apache.xml.utils.UnImplNode");
			clazz = Class.forName("org.apache.xml.utils.WrappedRuntimeException");
			clazz = Class.forName("org.apache.xml.utils.XMLChar");
			clazz = Class.forName("org.apache.xml.utils.XMLCharacterRecognizer");
			clazz = Class.forName("org.apache.xml.utils.XMLString");
			clazz = Class.forName("org.apache.xml.utils.XMLStringFactory");
			clazz = Class.forName("org.apache.xml.utils.res.XResourceBundle");
			clazz = Class.forName("org.apache.xml.utils.res.XResources_en");
			clazz = Class.forName("org.apache.xpath.DOM2Helper");
			clazz = Class.forName("org.apache.xpath.DOMHelper");
			clazz = Class.forName("org.apache.xpath.Expression");
			clazz = Class.forName("org.apache.xpath.ExpressionNode");
			clazz = Class.forName("org.apache.xpath.ExpressionOwner");
			clazz = Class.forName("org.apache.xpath.ExtensionsProvider");
			clazz = Class.forName("org.apache.xpath.NodeSetDTM");
			clazz = Class.forName("org.apache.xpath.SourceTreeManager");
			clazz = Class.forName("org.apache.xpath.VariableStack");
			clazz = Class.forName("org.apache.xpath.WhitespaceStrippingElementMatcher");
			clazz = Class.forName("org.apache.xpath.XPath");
			clazz = Class.forName("org.apache.xpath.XPathContext$XPathExpressionContext");
			clazz = Class.forName("org.apache.xpath.XPathContext");
			clazz = Class.forName("org.apache.xpath.XPathException");
			clazz = Class.forName("org.apache.xpath.XPathProcessorException");
			clazz = Class.forName("org.apache.xpath.XPathVisitable");
			clazz = Class.forName("org.apache.xpath.XPathVisitor");
			clazz = Class.forName("org.apache.xpath.axes.AttributeIterator");
			clazz = Class.forName("org.apache.xpath.axes.AxesWalker");
			clazz = Class.forName("org.apache.xpath.axes.BasicTestIterator");
			clazz = Class.forName("org.apache.xpath.axes.ChildIterator");
			clazz = Class.forName("org.apache.xpath.axes.ChildTestIterator");
			clazz = Class.forName("org.apache.xpath.axes.DescendantIterator");
			clazz = Class.forName("org.apache.xpath.axes.FilterExprIteratorSimple");
			clazz = Class.forName("org.apache.xpath.axes.FilterExprWalker$filterExprOwner");
			clazz = Class.forName("org.apache.xpath.axes.FilterExprWalker");
			clazz = Class.forName("org.apache.xpath.axes.HasPositionalPredChecker");
			clazz = Class.forName("org.apache.xpath.axes.IteratorPool");
			clazz = Class.forName("org.apache.xpath.axes.LocPathIterator");
			clazz = Class.forName("org.apache.xpath.axes.NodeSequence");
			clazz = Class.forName("org.apache.xpath.axes.OneStepIterator");
			clazz = Class.forName("org.apache.xpath.axes.OneStepIteratorForward");
			clazz = Class.forName("org.apache.xpath.axes.PathComponent");
			clazz = Class.forName("org.apache.xpath.axes.PredicatedNodeTest$PredOwner");
			clazz = Class.forName("org.apache.xpath.axes.PredicatedNodeTest");
			clazz = Class.forName("org.apache.xpath.axes.ReverseAxesWalker");
			clazz = Class.forName("org.apache.xpath.axes.SelfIteratorNoPredicate");
			clazz = Class.forName("org.apache.xpath.axes.SubContextList");
			clazz = Class.forName("org.apache.xpath.axes.UnionChildIterator");
			clazz = Class.forName("org.apache.xpath.axes.UnionPathIterator$iterOwner");
			clazz = Class.forName("org.apache.xpath.axes.UnionPathIterator");
			clazz = Class.forName("org.apache.xpath.axes.WalkerFactory");
			clazz = Class.forName("org.apache.xpath.axes.WalkingIterator");
			clazz = Class.forName("org.apache.xpath.axes.WalkingIteratorSorted");
			clazz = Class.forName("org.apache.xpath.compiler.Compiler");
			clazz = Class.forName("org.apache.xpath.compiler.FuncLoader");
			clazz = Class.forName("org.apache.xpath.compiler.FunctionTable");
			clazz = Class.forName("org.apache.xpath.compiler.Keywords");
			clazz = Class.forName("org.apache.xpath.compiler.Lexer");
			clazz = Class.forName("org.apache.xpath.compiler.OpMap");
			clazz = Class.forName("org.apache.xpath.compiler.OpMapVector");
			clazz = Class.forName("org.apache.xpath.compiler.XPathParser");
			clazz = Class.forName("org.apache.xpath.functions.FuncCount");
			clazz = Class.forName("org.apache.xpath.functions.FuncExtFunction");
			clazz = Class.forName("org.apache.xpath.functions.FuncGenerateId");
			clazz = Class.forName("org.apache.xpath.functions.FuncId");
			clazz = Class.forName("org.apache.xpath.functions.FuncLocalPart");
			clazz = Class.forName("org.apache.xpath.functions.FuncNot");
			clazz = Class.forName("org.apache.xpath.functions.FuncPosition");
			clazz = Class.forName("org.apache.xpath.functions.FuncQname");
			clazz = Class.forName("org.apache.xpath.functions.FuncStartsWith");
			clazz = Class.forName("org.apache.xpath.functions.Function");
			clazz = Class.forName("org.apache.xpath.functions.Function2Args$Arg1Owner");
			clazz = Class.forName("org.apache.xpath.functions.Function2Args");
			clazz = Class.forName("org.apache.xpath.functions.FunctionDef1Arg");
			clazz = Class.forName("org.apache.xpath.functions.FunctionOneArg");
			clazz = Class.forName("org.apache.xpath.functions.WrongNumberArgsException");
			clazz = Class.forName("org.apache.xpath.objects.Comparator");
			clazz = Class.forName("org.apache.xpath.objects.EqualComparator");
			clazz = Class.forName("org.apache.xpath.objects.GreaterThanComparator");
			clazz = Class.forName("org.apache.xpath.objects.GreaterThanOrEqualComparator");
			clazz = Class.forName("org.apache.xpath.objects.LessThanComparator");
			clazz = Class.forName("org.apache.xpath.objects.LessThanOrEqualComparator");
			clazz = Class.forName("org.apache.xpath.objects.NotEqualComparator");
			clazz = Class.forName("org.apache.xpath.objects.XBoolean");
			clazz = Class.forName("org.apache.xpath.objects.XBooleanStatic");
			clazz = Class.forName("org.apache.xpath.objects.XMLStringFactoryImpl");
			clazz = Class.forName("org.apache.xpath.objects.XNodeSet");
			clazz = Class.forName("org.apache.xpath.objects.XNumber");
			clazz = Class.forName("org.apache.xpath.objects.XObject");
			clazz = Class.forName("org.apache.xpath.objects.XRTreeFrag");
			clazz = Class.forName("org.apache.xpath.objects.XRTreeFragSelectWrapper");
			clazz = Class.forName("org.apache.xpath.objects.XString");
			clazz = Class.forName("org.apache.xpath.operations.And");
			clazz = Class.forName("org.apache.xpath.operations.Bool");
			clazz = Class.forName("org.apache.xpath.operations.Div");
			clazz = Class.forName("org.apache.xpath.operations.Equals");
			clazz = Class.forName("org.apache.xpath.operations.Gt");
			clazz = Class.forName("org.apache.xpath.operations.Gte");
			clazz = Class.forName("org.apache.xpath.operations.Lt");
			clazz = Class.forName("org.apache.xpath.operations.Lte");
			clazz = Class.forName("org.apache.xpath.operations.Minus");
			clazz = Class.forName("org.apache.xpath.operations.Mod");
			clazz = Class.forName("org.apache.xpath.operations.Mult");
			clazz = Class.forName("org.apache.xpath.operations.Neg");
			clazz = Class.forName("org.apache.xpath.operations.NotEquals");
			clazz = Class.forName("org.apache.xpath.operations.Number");
			clazz = Class.forName("org.apache.xpath.operations.Operation$LeftExprOwner");
			clazz = Class.forName("org.apache.xpath.operations.Operation");
			clazz = Class.forName("org.apache.xpath.operations.Or");
			clazz = Class.forName("org.apache.xpath.operations.Plus");
			clazz = Class.forName("org.apache.xpath.operations.Quo");
			clazz = Class.forName("org.apache.xpath.operations.String");
			clazz = Class.forName("org.apache.xpath.operations.UnaryOperation");
			clazz = Class.forName("org.apache.xpath.operations.Variable");
			clazz = Class.forName("org.apache.xpath.patterns.ContextMatchStepPattern");
			clazz = Class.forName("org.apache.xpath.patterns.FunctionPattern");
			clazz = Class.forName("org.apache.xpath.patterns.NodeTest");
			clazz = Class.forName("org.apache.xpath.patterns.StepPattern$PredOwner");
			clazz = Class.forName("org.apache.xpath.patterns.StepPattern");
			clazz = Class.forName("org.apache.xpath.patterns.UnionPattern$UnionPathPartOwner");
			clazz = Class.forName("org.apache.xpath.patterns.UnionPattern");
			clazz = Class.forName("soot.rtlib.tamiflex.IUnexpectedReflectiveCallHandler");
			clazz = Class.forName("soot.rtlib.tamiflex.OpaquePredicate");
			clazz = Class.forName("soot.rtlib.tamiflex.ReflectiveCalls");
			clazz = Class.forName("soot.rtlib.tamiflex.ReflectiveCallsWrapper");
			clazz = Class.forName("soot.rtlib.tamiflex.SootSig");
			clazz = Class.forName("soot.rtlib.tamiflex.UnexpectedReflectiveCall");



		} catch (Exception ex ) {
			assert(false) : ex.toString();
		}
	}
	
	public static void premain(String args, Instrumentation inst) {
		System.out.println("Class Resolver Agent begin");

	}
}
