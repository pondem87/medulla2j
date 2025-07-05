# Architecture

## Functional architecture design

### Functions list

* receive whatsapp webhooks
* parse whatsapp webhook payload
* identify whatsapp webhook payload type
* extract user text from whatsapp webhook and send to LLM
* extract user image from whatsapp webhook and send to LLM
* extract user document from whatsapp webhook and send to LLM
* extract user video from whatsapp webhook and send to LLM
* send text to LLM to generate text response
* send document to LLM to generate text response
* send image to LLM to generate text response
* send video to LLM to generate text response
* generate images from LLM when requested
* generate audio from LLM when requested
* send text to user via whatsapp
* send image to user via whatsapp
* send audio to user via whatsapp
* track and store usage statistics by user
* enforce usage limits per user
* track user's selected LLM
* track user subscriptions
* enforce subscription based usage limits
* store list of LLMs
* let user chose LLM
* let user make payment for subscription
* let user upgrade subscription
* let user view payment history
* let user view subscription status
* let user view usage statistics
* provide subscription tiers
* group LLMs into tiers