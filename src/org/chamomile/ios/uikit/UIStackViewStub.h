#ifndef _OrgChamomileIosUikitUIStackViewStub_H_
#define _OrgChamomileIosUikitUIStackViewStub_H_

#include <UIKit/UIKit.h>

#include "J2ObjC_common.h"
#include "UIKit4J_common.h"

#include "UIStackView.h"

@interface UIStackView (JavaUIStackView) <OrgChamomileIosUikitUIStackView>
@end

__attribute__((always_inline)) inline void UIStackView_init(NSObject *self) {
    #pragma unused(self)
}

J2OBJC_EMPTY_STATIC_INIT(UIStackView)

J2OBJC_TYPE_LITERAL_HEADER(UIStackView)

// Empty class to force category to be loaded.
@interface JavaUIStackViewCategoryDummy : UIStackView
@end

#endif // _OrgChamomileIosUikitUIStackViewStub_H_