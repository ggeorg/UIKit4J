#import "UIViewControllerStub.h"

#import "J2ObjC_source.h"

@implementation UIViewController (JavaUIViewController)
    
+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosUikitUIView;", 0x1, 0, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 1, 2, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosUikitUIView;", 0x1, 3, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, 4, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 5, 6, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(viewDidLoad);
  methods[2].selector = @selector(didReceiveMemoryWarning);
  methods[3].selector = @selector(view);
  methods[4].selector = @selector(setView:);
  methods[5].selector = @selector(loadView);
  methods[6].selector = @selector(loadViewIfNeeded);
  methods[7].selector = @selector(viewIfLoaded);
  methods[8].selector = @selector(title);
  methods[9].selector = @selector(setTitle:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "getView", "setView", "LOrgChamomileIosUikitUIView;", "getViewIfLoaded", "getTitle", "setTitle", "LNSString;" };
  static const J2ObjcClassInfo _UIViewController = { "UIViewControllerStub2", "org.chamomile.ios.uikit", ptrTable, methods, NULL, 7, 0x1, 10, 0, -1, -1, -1, -1, -1 };
  return &_UIViewController;
}

@end

void UIViewController_init(UIViewController *self) {
  static IMP initImp;
  static dispatch_once_t token;
  dispatch_once(&token, ^{
    initImp = [UIViewController instanceMethodForSelector:@selector(init)];
  });
  ((id (*)(id, SEL))initImp)(self, @selector(init));
}

UIViewController *new_UIViewController_init() {
  J2OBJC_NEW_IMPL(UIViewController, init)
}

UIViewController *create_UIViewController_init() {
  J2OBJC_CREATE_IMPL(UIViewController, init)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(UIViewController)

// Empty class to force category to be loaded.
@implementation JavaUIViewControllerCategoryDummy
@end
