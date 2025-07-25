# Requirements

### User requirements
* register for service via whatsapp
* send and messages via whatsapp including text, interactive messages, images, audio, video and documents
* receive AI generated responses of all above types where applicable
* choose LLM model to use
* choose subscription tier and make payment
* choose payment currency
* view payment history
* view usage statics and limits - tokens used, messages sent, images generated
* opt in or out to promotional messages

### Business requirements - internal admin use
* manage subscriptions - add, modify tiers
* view usage statistics - daily active users, user demographics, token usage per model
* view user details, activity log, subscription and payment history
* send bulk template messages
* manage whatsapp message templates
* view and manage bulk template message performance
* embed or upsell promotions into service conversations
* view and edit payments history

### system requirements
* track LLM token usage per model per user
* enforce LLM token usage limits per user
* manage currency conversions

### Nonfunctional requirements
* comply with whatsapp api policy
* high availability
* rate limiting to public api
* two-factor auth for public api