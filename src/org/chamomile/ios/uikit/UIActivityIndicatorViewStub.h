#ifndef _OrgChamomileIosUikitUIActivityIndicatorViewStub_H_
#define _OrgChamomileIosUikitUIActivityIndicatorViewStub_H_

#include <UIKit/UIKit.h>

#include "J2ObjC_common.h"
#include "UIKit4J_common.h"

#include "UIActivityIndicatorView.h"

@interface UIActivityIndicatorView (JavaUIActivityIndicatorView) <OrgChamomileIosUikitUIActivityIndicatorView>
@end

__attribute__((always_inline)) inline void UIActivityIndicatorView_init(NSObject *self) {
    #pragma unused(self)
}

J2OBJC_EMPTY_STATIC_INIT(UIActivityIndicatorView)

J2OBJC_TYPE_LITERAL_HEADER(UIActivityIndicatorView)

// Empty class to force category to be loaded.
@interface JavaUIActivityIndicatorViewCategoryDummy : UIActivityIndicatorView
@end

#endif // _OrgChamomileIosUikitUIActivityIndicatorViewStub_H_